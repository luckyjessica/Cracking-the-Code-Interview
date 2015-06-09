package ch1_array_string;

// O(n^2) in time
// O(n)in space
public class _1_6_RotateImage {
	public static int[][] RotateImage(int[][] mtx, int n){
		// the layer in the matrix is 2/n
		for(int layer=0;layer < n/2; layer++){
			//the first element of that layer
			int start = layer;
			int stop = n-layer-1;
			for(int i= start;i< stop; i++){
				//how many element has it pass in a row
				int offset = i-start;
				int tmp = mtx[start][i];
				mtx[start][i]=mtx[stop-offset][start];
				mtx[stop-offset][start]=mtx[stop][stop-offset];
				mtx[stop][stop-offset]=mtx[i][stop];
				mtx[i][stop]=tmp;
			}
			
		}
		return mtx;
		
	}
	public static void main(String arg[]){
		int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		System.out.println("Before");
        printArray(matrix);
		System.out.println("After");
        printArray(RotateImage(matrix, 5));     
    }
    
    private static void printArray(int[][] a) {
        for (int[] row : a) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
	}
}

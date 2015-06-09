package ch1_array_string;

//O(n^2)in time.
public class _1_7_serZero {
	public static int[][] setZero(int[][] mtx){
		boolean row[] = new boolean[mtx.length];
		boolean col[] = new boolean[mtx[0].length];
		for(int i=0;i<mtx.length;i++){
			for(int j=0;j<mtx[0].length;j++){
				if(mtx[i][j]==0){
					row[i]=true;
					col[j]=true;
			}
		}
	}
		for(int i=0;i<mtx.length;i++){
			for(int j=0;j<mtx[0].length;j++){
				if(row[i]||col[j])
					mtx[i][j]=0;
			}
		}
		return mtx;
	}
	public  static void main(String arg[]){
		int[][] matrix = {{1,2,3,0,5},{6,7,8,9,10},{11,12,13,14,15},{16,0,18,19,20},{21,22,23,24,25}};
		System.out.println("Before");
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		setZero(matrix);
		System.out.println("After");
		for(int m=0;m<matrix.length;m++){
			for(int n=0;n<matrix[0].length;n++){
				System.out.print(matrix[m][n]+" ");
				}
			System.out.println();
			}
		}
	}
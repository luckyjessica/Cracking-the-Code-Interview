package ch3_stack_queue;

public class Solution {
    public static int removeElement(int[] A, int elem) {
        int count=0;
        int i = 0;
        while(i<A.length-count){
            if(A[i]==elem){
                count++;
                for(int j=0;j<A.length-i-1;j++){
                    A[i+j]=A[i+j+1];
                    for(int n=0;n<A.length;n++){
                        System.out.println("A["+n+"]="+A[n]);
                        }
                }
            }
            else i++;
        }
        for(int n=0;n<A.length;n++){
        System.out.println(A[n]);
        }
        return A.length-count;
    }
    public static void main(String arg[]) throws Exception{
		int[]b={3,3};
		System.out.println(removeElement(b,3));	
	}
}

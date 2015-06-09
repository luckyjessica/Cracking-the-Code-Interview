package ch2_linkedlist;

public class _2_2_kthtoLast {
    public static int recursion(Node head, int k){
    	//递归出
        if (head == null) return 0;   
        else{
        	int i = recursion(head.getNext(), k) + 1;
        	if (i == k) {
        		System.out.println(" The" +head.getData());
        		}
        	return i;
        	}
    }
    
   public static Node runner(SingleLL list,int k){
	   Node p1 = list.head;
	   Node p2 = list.head;
	   
	   for(int i=0;i<k;i++){
		   // it means, loop for k+ times, p2==null
		   if(p2==null) return null;
		   p2 = p2.getNext();
	   }
	   //id p2==null, it means k=length of the list, then the kth element is the head.
	   while(p2!=null){
		   p1 = p1.getNext();
		   p2 = p2.getNext();
	   }
	   return p1;
   }
    
	public static void main(String arg[]){
		int[] a ={13,18,19,10,11,12};
    	SingleLL myList = new SingleLL();
    	for(int i=0;i<a.length;i++){
    		myList.addfirst(a[i]);
    	}
    	System.out.println(myList.toString());
    	recursion(myList.head,2);
    	if(runner(myList,2)!=null) System.out.println(runner(myList,2).getData());
    	else System.out.println("Out of the length");
	}
}

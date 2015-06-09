package ch2_linkedlist;

public class _2_3_deleteMiddle {
	public static SingleLL deleteMiddle(SingleLL list,Node n){
		n.setData(n.getNext().getData());
		//if it is the second to last node, we should set the next node to NULL.
		if(n.getNext().getNext()!=null){
			n.setNext(n.getNext().getNext());
		}else{
			n.setNext(null);
		}
		return list;
	}
	public static void main(String arg[]){
		int[] a ={13,18,19,10,11,12};
    	SingleLL myList = new SingleLL();
    	for(int i=0;i<a.length;i++){
    		myList.addfirst(a[i]);
    	}    	
    	Node x = myList.head.getNext().getNext().getNext().getNext();
    	System.out.println(myList.toString());
    	System.out.println(deleteMiddle(myList,x).toString());
	}
}

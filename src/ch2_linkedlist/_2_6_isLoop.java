package ch2_linkedlist;

public class _2_6_isLoop {
	public static Node isLoop(SingleLL list){
		Node slow = list.head;
		Node fast = list.head;
		while(fast!=null && fast.getNext()!=null){
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if(slow == fast){
				break;
			}
		}
		if(fast ==null){
			System.out.println("No loop");
			return null;
		}else{
			slow = list.head;
			while(fast!=slow){
				fast = fast.getNext();
				slow = slow.getNext();
			}
		}
		return slow;
		}
	
	public static void main(String arg[]){
		int[] a ={1,2,3,4,5,6};
    	SingleLL myList = new SingleLL();
    	for(int i=0;i<a.length;i++){
    		myList.addfirst(a[i]);
    	}
    	System.out.println(myList.toString());
    	System.out.println(isLoop(myList));
	}
}

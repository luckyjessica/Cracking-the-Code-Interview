package ch2_linkedlist;

public class _2_4_Partition {
	public static SingleLL Partition(SingleLL list, int v){
		Node current = list.head;
		SingleLL list1 = new SingleLL();
		SingleLL list2 = new SingleLL();
		while(current!=null){
			if(current.getData()<v){
				list1.addfirst(current.getData());
			}
			else if(current.getData()>v){
				list2.addLast(current.getData());
			}
			else{
				Node n = new Node(current.getData());
				n.setNext(list2.head);
				list2.head = n;
				}
			current = current.getNext();
		}
		list1.tail.setNext(list2.head);
		return list1;
	}
	
	public static void main(String arg[]){
		int[] a ={14,13,18,19,10,11,12};
    	SingleLL myList = new SingleLL();
    	for(int i=0;i<a.length;i++){
    		myList.addfirst(a[i]);
    	}  
    	System.out.println(myList.toString());
    	System.out.println(Partition(myList,13));
		System.out.println(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());

	}
}

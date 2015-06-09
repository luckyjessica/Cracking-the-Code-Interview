package ch2_linkedlist;

import java.util.Hashtable;

public class _2_1_removeDuplicate {
	public static SingleLL removeDuplicate(SingleLL list){
		Hashtable<Integer,Boolean> table = new Hashtable<Integer,Boolean>();
		Node current = list.head;
		table.put(current.getData(), true);
		while(current.getNext()!=null){
			if(table.containsKey(current.getNext().getData())){
				current.setNext(current.getNext().getNext());
			}else{
				table.put(current.getNext().getData(), true);
				// remember to move the pointer!!!
				current = current.getNext();
			}
		}
		System.out.println(table);
		return list;
	}
	
	//no temp buffer!! RUNNER tech!!! space efficiently!! but more time!!
	public static SingleLL Runner(SingleLL list){
		Node current = list.head;
		while(current!=null){
			Node runner = current;
			// runner initially point to the current, always checking the node next to this runner
			while(runner.getNext()!=null){
				if( runner.getNext().getData() == current.getData()){
					runner.setNext(runner.getNext().getNext());
				}
				else{
					runner = runner.getNext();
				}
			}
			current = current.getNext();
		}
		return list;
	}
	
	public static void main(String arg[]){
		int[] a ={1,1,2,3,3,2,1,2,4,9,9};
    	SingleLL myList = new SingleLL();
    	for(int i=0;i<a.length;i++){
    		myList.addfirst(a[i]);
    	}
    	System.out.println(myList.toString());
    	System.out.println(Runner(myList));
	}
}

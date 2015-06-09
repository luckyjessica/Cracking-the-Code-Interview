package ch2_linkedlist;

public class SingleLL {
	protected Node head=null;
	protected Node tail=null;
	protected int size=0;
	
	public int getSize(){
		return size;
	}
	
	public void addLast(int x){
		Node newnode = new Node(x);
		if(size==0){
			head = newnode;
			tail = head;
		}
		else{
			tail.setNext(newnode);
			tail = newnode;
		}
		size = size+1;
	}
	
	public void addfirst(int x){
		Node newnode = new Node(x);
		if(size==0){
			tail = newnode;
			head = tail;
		}
		else{
			newnode.setNext(head);
			head = newnode;
		}
		size = size+1;
	}
	public void deleteFirst(){
		if(head==null) System.err.println("Empty list!");
		else{
			Node t = head;
			head = head.getNext();
			t.setNext(null);
			size = size - 1;
		}
	}
	
	public void deleteNode(int d){
		Node current = head;
		while(current.getNext().getData()!=d){
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
	}
	
	public String toString(){
		String output = "";
		if(head==null) output = "Empty list!";
		Node current = head;
		while(current!=null){
			output = output + current.getData();
			if(current.getNext()!=null) output +="->";
			current = current.getNext();
		}
		return output;
	}//end toString
	
	//test
	public static void main(String arg[]){
		int[] a ={1,2,3,4,5,6};
    	SingleLL myList = new SingleLL();
    	for(int i=0;i<a.length;i++){
    		myList.addLast(a[i]);
    	}
    	System.out.println(myList.toString());
		myList.deleteFirst();

    	System.out.println(myList.toString());
		myList.deleteNode(3);
    	System.out.println(myList.toString());

    }
	
}

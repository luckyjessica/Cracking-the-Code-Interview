package ch2_linkedlist;

public class Node {
		private int data;
	    private Node next;
	    
	    //initial Node method
	    public Node(int x){
	    	data = x;
	    	next = null;
	    }
	    //Encapsulation
	    //get the data of current node
	    public int getData(){
	    	return data;
	    }
	    //get the next node the pointer point to
	    public Node getNext(){
	    	return next;
	    }
	    //Modify
	    //change the data in this node
	    public void setData(int newx){
	    	data = newx;
	    }
	    // change the pointer
	    public void setNext(Node n){
	    	next = n;
	    }   
}

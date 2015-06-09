package ch3_stack_queue;

import ch2_linkedlist.Node;

public class Stack1 {
	protected Node top=null;
	public Object pop(){
		if(top!=null){
			Object item = top.getData();
			top = top.getNext();
			return item;
		}
		else return null;
		}
	public void push(int v){
		Node n = new Node(v);
		n.setNext(top);
		top = n;
	}
	public Object peek(){
		return top.getData();
	}
}

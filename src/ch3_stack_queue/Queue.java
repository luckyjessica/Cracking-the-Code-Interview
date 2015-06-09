package ch3_stack_queue;

import ch2_linkedlist.Node;

public class Queue {
	protected Node head=null;
	protected Node tail=null;
	public void enqeue(int a){
		Node n = new Node(a);
		if(head==null){
			head=n;
			tail=head;
		}
		else{
			tail.setNext(n);
			tail=n;
		}
	}
	public Object dequeue(){
		if(head==null) return null;
		Node tmp = head;
		tmp.setNext(null);
		head = head.getNext();
		return tmp.getData();
	}
	public static void main(String arg[]){
		int[]a={1,2,3};
		int[]b={4,5,6};
		b=a;
		for(int i=0;i<b.length;i++){
		System.out.println(b[i]);
		}
	}
}

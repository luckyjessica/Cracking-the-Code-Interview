package ch2_linkedlist;

import java.util.Stack;

public class _2_7_isPalindrome {
	public static boolean reverse(SingleLL list){
		Stack<Integer> stk = new Stack<Integer>();
		Node current = list.head;
		int length = 0;
		while(current!=null){
			stk.push(current.getData());
			current = current.getNext();
			length++;
		}
		for(int i=0;i<(length-1)/2;i++){
			System.out.println("s");

			Node n = list.head;
			System.out.println(n.getData()!=stk.pop()?"true":"false");
			if(n.getData()!=stk.pop()) {
				return false;
				}
			else{n = n.getNext();}
			System.out.println(n.getData());
		} 
		return true;
	}
	
	public static boolean iterative(SingleLL list){
		Node slow = list.head;
		Node fast = list.head;
		Stack<Integer> stk = new Stack<Integer>();
		while(fast!=null && fast.getNext()!=null){
			stk.push(slow.getData());
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		// odd number , skip the middle element
		if(fast!=null) slow = slow.getNext();
		//compare the top of the stack and the second part
		while(slow!=null){
			if(slow.getData()!=stk.pop()) return false;
			slow = slow.getNext();
		}
		return true;
	}
	
	public static void main(String arg[]){
	int[] a ={14,13,18,19,18,13,14};
	SingleLL myList = new SingleLL();
	for(int i=0;i<a.length;i++){
		myList.addfirst(a[i]); 
	}
	System.out.println(myList.toString());
	if(reverse(myList)) System.out.println("YES");
	else System.out.println("NO");
	}
}

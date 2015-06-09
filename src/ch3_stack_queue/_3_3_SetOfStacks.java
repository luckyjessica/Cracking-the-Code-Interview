package ch3_stack_queue;
import java.util.ArrayList;
import java.util.Stack;

import ch2_linkedlist.Node;

public class _3_3_SetOfStacks {
	ArrayList<Stack> stacks = new ArrayList<Stack>();
	public int capacity;
	public _3_3_SetOfStacks(int capacity){
		this.capacity = capacity;
	}
	
	public Stack getLastStack(){
		if(stacks.size()==0)return null;
		else
			return stacks.get(stacks.size()-1);
	}
	public void push(int v){
		Stack last = getLastStack();
		if(last!=null&&!last.isFull()) last.push(v);
		else{
			//create new stack
			Stack stack = new Stack(capacity);
			stack.push(v);
			stacks.add(stack);
		}
	}
	
	public int pop(){
		Stack last = getLastStack();
		int v = last.pop();
		// if the last stack has only one element, delete it
		if(last.size() == 0) stacks.remove(stacks.size()-1);
		return v;
	}
	
	public intpopAt(int index){
		return leftShift(index,true);
	}
	
	public int leftShift(int index,boolean removeTop){
		Stack stack = getLastStack();
		int removed_item;
	}
}
//Stack class
	public class Stack{
		private int capacity;
		public Node top,bottom;
		public int size=0;
		//constructor
		public Stack(int capacity){
			this.capacity = capacity;
		}
		public boolean isFull(){
			return capacity==size;
		}
		
		public void join(Node above,Node below){
			
		}
	}

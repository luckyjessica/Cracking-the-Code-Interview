package ch3_stack_queue;
import java.util.Stack;

public class _3_2_Stackwithmin extends Stack<Integer>{
	Stack<Integer> s;
	//constructor
	public _3_2_Stackwithmin(){
		s = new Stack<Integer>();
	}
	
	public void push(int value){
		if(value<=min()){
			s.push(value);
		}
	}
	
	public Integer pop(){
		int value = super.pop();
		if(value == min()){
			s.pop();
		}
		return value;
	}
	public int min(){
		if(s.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return s.peek();
		}
	}
}

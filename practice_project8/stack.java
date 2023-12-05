package practice_project8;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s1=new Stack<Integer>();
		
		//to push elements
		s1.push(24);
		s1.push(10);
		s1.push(03);
		s1.push(12);
		
		//print stack elements
		
		System.out.println("After insertion sucessfully:"+s1);
		
		//empty stack elements
		while(!s1.empty()) {
			int popped=s1.pop();
			System.out.println("Element deleted after each"+popped);
		}

		System.out.println("After deletion of stack:"+s1);
 
	}


}

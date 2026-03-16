package list;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.print("Initial size: "+stack.size());
		
		stack.add(1);
		stack.push(2);
		stack.add(0,3);
		stack.push(4);
		stack.push(5);
		
		System.out.print("\nSize after insertions: "+stack.size());
		
		System.out.print("\n"+stack);
		
		System.out.print("\nPeek element: "+stack.peek());
		
		stack.remove(0);
		stack.pop();
		
		System.out.print("\nPeek element after deletion: "+stack.peek());
		
		System.out.print("\nSize after deletions: "+stack.size());
		
		System.out.print("\n"+stack);
	}

}

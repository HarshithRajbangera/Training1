package placement;

import java.util.Stack;

public class MinStack {
	Stack<Integer> stack; 
	Stack<Integer> minStack; 
	    
	MinStack(){    
		stack=new Stack<>();
		minStack=new Stack<>();
	}
	
	void push(int val) {
		stack.push(val);
		
		if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
	}
	
	public void pop() {
        if (stack.isEmpty()) return;
       
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }
	
	 public int top() {
	        return stack.peek();
	    }

	    public int getMin() {
	        return minStack.peek();
	    }

	public static void main(String[] args) {
		    MinStack minStack = new MinStack();
	        minStack.push(-2);
	        minStack.push(0);
	        minStack.push(-3);
	        System.out.println(minStack.getMin()); 
	        minStack.pop();
	        System.out.println(minStack.top());    
	        System.out.println(minStack.getMin()); 
	        
	}

}

package placement;

import java.util.Stack;

public class ConsecutiveDuplicateStack {

	public static void main(String[] args) {
		
		String str="aabbccdde";
		
		Stack<Character> st1=new Stack<>();
		Stack<Character> st2=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			st1.push(str.charAt(i));
		}
		st2.push(st1.pop());
		
		while(!st1.isEmpty()) {
			
			if(st1.peek()==st2.peek()) {
				st1.pop();
				st2.pop();
			}
			else {
				st2.push(st1.pop());
			}
		}
		System.out.println(st2);

	}

}

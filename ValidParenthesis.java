package String;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		
		String exp = "{([])}"; //valid
				//"([]"; //not valid
				//"[(])"; //not valid
				//"[()]{}{[()()]()}"; //valid
				//"{[}]"; //not valid
				//"{}[]"; //valid
		boolean valid = checkValid(exp);
		if(valid) {
			System.out.println("valid parenthesis");
		}else {
			System.out.println("not valid");
		}
	}

	private static boolean checkValid(String exp) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);
			if(c == '(' || c == '{' || c=='[') {
				stack.push(c);
			}
			
			if(c == ')') {
				if(stack.peek() != '(' || stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
			
			if(c == '}') {
				if(stack.peek() !='{' || stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
			if(c == ']') {
				if(stack.peek() !='[' || stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
			
		}
		System.out.println(stack);
		if(stack.isEmpty()) {
			return true;
		}
		return false;
	}

}

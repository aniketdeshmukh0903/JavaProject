package ninja;

import java.util.Stack;

public class BracketStack {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

        
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
        
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
               
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

      
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[()]}";
        if (isBalanced(input)) {
            System.out.println("The brackets are balanced.");
        } else {
            System.out.println("The brackets are not balanced.");
        }
    }
}

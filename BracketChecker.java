import java.util.Stack;

public class BracketChecker {
    public static boolean isBracketSequenceValid(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "((2 + 3) * 5) - 8";
        String expression2 = "((2 + 3) * 5 - 8";
        String expression3 = "((2 + 3) * 5) - 8)";

        System.out.println("Expression 1: " + expression1);
        System.out.println("Is bracket sequence valid? " + isBracketSequenceValid(expression1));

        System.out.println("Expression 2: " + expression2);
        System.out.println("Is bracket sequence valid? " + isBracketSequenceValid(expression2));

        System.out.println("Expression 3: " + expression3);
        System.out.println("Is bracket sequence valid? " + isBracketSequenceValid(expression3));
    }
}
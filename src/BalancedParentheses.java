import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            else if (ch == ')' && !stack.isEmpty() && stack.pop() != '(') return false;
            else if (ch == '}' && !stack.isEmpty() && stack.pop() != '{') return false;
            else if (ch == ']' && !stack.isEmpty() && stack.pop() != '[') return false;
            else if (ch == ')' || ch == '}' || ch == ']' && stack.isEmpty()) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("({[]})")); // Output: true
        System.out.println(isBalanced("({[}])")); // Output: false
    }
}

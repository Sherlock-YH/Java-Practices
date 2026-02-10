import java.util.ArrayDeque;

public class ValidParentheses {
    public static boolean isValid(String s) {
        // 使用 ArrayDeque 作为栈
        ArrayDeque<Character> queue = new ArrayDeque<>();

        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                queue.push(c);
            }
            else {
                if(queue.isEmpty()){
                    return false;
                }
                char top = queue.pop();

                if(top == '(' && c != ')' ||
                   top == '{' && c != '}' ||
                   top == '[' && c != ']' ){
                    return false;
                }
            }
        }
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        
        System.out.println(isValid("()"));      // true
        System.out.println(isValid("()[]{}"));  // true
        System.out.println(isValid("(]"));      // false
        System.out.println(isValid("([)]"));    // false
        System.out.println(isValid("{[]}"));    // true
        System.out.println(isValid("]"));       // false（栈为空时遇到右括号）
    }
}

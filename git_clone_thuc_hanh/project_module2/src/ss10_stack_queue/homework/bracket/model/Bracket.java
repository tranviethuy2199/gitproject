package ss10_stack_queue.homework.bracket.model;

import java.util.Stack;

public class Bracket {


    public Bracket() {};


    public static boolean checkBracket(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <string.length() ; i++) {
            char bracket = string.charAt(i);
            if (bracket == '(') {
                stack.push(bracket);
            }else if (bracket == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
            
        }
        return stack.isEmpty();
    }
}

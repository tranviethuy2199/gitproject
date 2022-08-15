package ss10_stack_queue.homework.Palindrome.model;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {

    //    So sánh từng phần tử của stack và queue, nếu giống nhau từng cặp thì đó là chuỗi Palindrome
//    ngược lại thì chuỗi trên không phải là chuỗi Palindrome.
    private static Stack<Character> characterStack = new Stack<>();
    private static Queue<Character> queue = new LinkedList<>();

    public Palindrome() {
    }

    ;

    public static void reversePalindrome(String string) {
        string = string.trim();
        string = string.toLowerCase();


        for (int i = 0; i < string.length(); i++) {
            characterStack.push(string.charAt(i));
            queue.add(string.charAt(i));
        }
        for (int i = 0; i < string.length(); i++) {
            if (!(characterStack.pop().equals(queue.poll()))) {
                System.out.println(" not Palindrome");
                return;
            }
        }
        System.out.println(" palindrome");

    }

}


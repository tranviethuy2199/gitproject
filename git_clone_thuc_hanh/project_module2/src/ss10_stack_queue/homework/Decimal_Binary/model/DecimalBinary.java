package ss10_stack_queue.homework.Decimal_Binary.model;

import java.util.Scanner;
import java.util.Stack;

public class DecimalBinary {

    // tạo stack
    private static Stack<Integer> integerStack = new Stack<>();


    public DecimalBinary() {
    }

    ;
    // điều kiện để thay đổi số thập phân thành nhị phân
    public static void transfer(int number) {
        while (number != 0) {
            integerStack.push(number % 2);
            number /= 2;
        }
        while (!integerStack.isEmpty()) {
            System.out.print(integerStack.pop());
        }
    }


}

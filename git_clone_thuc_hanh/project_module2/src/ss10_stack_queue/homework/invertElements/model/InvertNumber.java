package ss10_stack_queue.homework.invertElements.model;


import java.util.Arrays;
import java.util.Stack;

public class InvertNumber {
//    Ý tưởng giải quyết vấn đề:
//    1. Khởi tạo một Stack rỗng, có kiểu số.
//    2. Với n phần tử của mảng, lần lượt đưa vào Stack thông qua hàm Push:
//    Push a[i] into Stack.
//    3. Lần lượt lấy ra từ Stack n phần tử và đưa vào trở lại mảng ban đầu:
//    4. Kết thúc giải thuật.

//      cách này viết trực tiếp
//    public static void mainDecimal(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(reverseIntegerUseStack(array)));
//    }
//      tạo constructor cho hàm mainDecimal chuyển tới
        public InvertNumber() {};


//          đảo ngược mảng bằng integer
         public static int[] reverseIntegerUseStack (int[] array){
            int[] array1 = new int[array.length];
            Stack<Integer> stack = new Stack<>();
            for (int arrayElement : array) {
                stack.push(arrayElement);
            }
            for (int i = 0; i < array1.length; i++) {
                array1[i] = stack.pop();
            }
            return array1;
        }
}






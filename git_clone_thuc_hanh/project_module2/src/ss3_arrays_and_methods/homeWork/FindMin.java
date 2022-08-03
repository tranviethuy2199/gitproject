package ss3_arrays_and_methods.homeWork;

public class FindMin {
    public static void main(String[] args) {

        // tìm giá trị nhỏ nhất trong mảng
        int[] number = {5,6,3,2,8,9} ;
        int min = number[0];
        for (int i = 0; i <number.length ; i++) {
            if (min>number[i])
                min=number[i];
        }
        System.out.println("số nhỏ nhất là : " + min);
    }
}

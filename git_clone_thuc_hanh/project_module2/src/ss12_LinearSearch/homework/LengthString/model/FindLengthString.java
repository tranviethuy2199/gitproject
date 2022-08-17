package ss12_LinearSearch.homework.LengthString.model;

import java.util.LinkedList;
import java.util.Scanner;

public class FindLengthString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        String strAscenMaxLength;

        System.out.print("Nhập vào một chuỗi:");
        str = sc.nextLine();
        strAscenMaxLength = stringAscendingMaxLength(str);
        System.out.printf("Chuỗi con liên tiếp lớn nhất trong %s : %s", str, strAscenMaxLength );
    }


    static String stringAscendingMaxLength(String str) {
        String strSub = "";
        String result = "";
        for (int i = 0; i < str.length()-1; i++) {
            strSub += str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > str.charAt(i)) {
                    strSub += str.charAt(j);
                    i = j;
                } else {
                    break;
                }

            }
            result = strSub.length() > result.length() ? strSub : result;
            strSub ="";
        }
        return result;
    }
}

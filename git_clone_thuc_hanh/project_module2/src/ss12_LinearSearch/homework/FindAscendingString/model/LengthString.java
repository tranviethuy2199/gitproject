package ss12_LinearSearch.homework.FindAscendingString.model;

import java.util.Scanner;

public class LengthString {
//        public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Nhập chuỗi: ");
//        String string = input.nextLine();
//
//        LinkedList<Character> max = new LinkedList<>();
//
//        // Tìm chuỗi tăng dần có độ dài lớn nhất
//        for (int i = 0; i < string.length(); i++) {
//            LinkedList<Character> list = new LinkedList<>();
//            list.add(string.charAt(i));
//            for (int j = i + 1; j < string.length(); j++) {
//                if (string.charAt(j) > list.getLast()) {
//                    list.add(string.charAt(j));
//                }
//            }
//
//            if (list.size() > max.size()) {
//                max.clear();
//                max.addAll(list);
//            }
//            list.clear();
//        }
//
//        for (Character ch: max) {
//            System.out.print(ch);
//        }
//        System.out.println();
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nguowif dung nhap chuoi: ");
        String string = scanner.nextLine();

        System.out.println(chain(string));
    }

    public static String chain(String string) {
        String str = "";
        str += string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            if (str.charAt(str.length() - 1) < string.charAt(i)) {
                ;
                str += string.charAt(i);
            }
        }
        return str;
    }
}

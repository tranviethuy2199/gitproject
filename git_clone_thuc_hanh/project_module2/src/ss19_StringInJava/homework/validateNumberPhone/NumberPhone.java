package ss19_StringInJava.homework.validateNumberPhone;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {

//    Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
//    x là ký tự số
//    Không chứa các ký tự đặc biệt
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PHONENUMBER_REGEX = "^[+][(][8][4][)][-][(][\\d]{10}[)]$";
    // ^ bắt đầu một chuỗi string
    // () và 84 là bắt đầu sdt vn
    // [\\d]{10} thể hiện 10 số sau


    public NumberPhone() {pattern = Pattern.compile(PHONENUMBER_REGEX);}

    public boolean numberPhone(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    private static NumberPhone numberPhone;
//    public static final String[] numberPhoneText = new String[] {"+(84)-(0978489648)","+(84)-(1234567890)","(84)-(097848964568)","(84)-(1234567s890)"};
    public static final String[] numberPhoneText = new String[]{};


    public static void main(String[] args) {
        numberPhone = new NumberPhone();
        Scanner sc = new Scanner(System.in);
        String numberPhoneText = sc.nextLine();
            boolean isNumber = numberPhone.numberPhone(numberPhoneText);
            System.out.println("số điện thoại đúng cú pháp là : " + numberPhoneText + " " + isNumber);
        }
    }


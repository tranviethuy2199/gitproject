package ss19_StringInJava.homework.validateClassName1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASSNAME_REGEX = "^(CAP)\\d{4}(G|H|I|K|L| M])$";
    // ^           : bắt đầu chuỗi string hoặc một dòng .
    // [CAP]       : bắt đầu với kí tự A hoặc C hoặc P .
    // \d{4}       : 1 số có 4 chữ số
    // [G|H|I|K|L|M] : KẾT thức bằng g h i k l m
    public ValidateClassName() {
        pattern = Pattern.compile(CLASSNAME_REGEX);
    }


    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);

        return matcher.matches();
    }


        private static ValidateClassName validateClassName;
//        public static final String[] valiClassName = new String[] {"C0318G","C0622G","M0318G"};
        public static final String[] valiClassName = new String[]{};

    public static void main(String[] args) {
        validateClassName = new ValidateClassName();
        Scanner sc = new Scanner(System.in);
        String valiClassName = sc.nextLine();
            boolean isvalid = validateClassName.validate(valiClassName);
            System.out.println(valiClassName + isvalid );
        }
    }



package LuyenTap.StudentManager.service.textKey;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameFormat {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NAMEFORMAT_REGEX = "^[A-Za-z]{5,50}[^\\d]";
    public NameFormat() {pattern = Pattern.compile(NAMEFORMAT_REGEX);}

    public boolean nameFormatCheck(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    private static NameFormat nameFormat;
    public static final String[] nameFormatText = new String[]{};


}

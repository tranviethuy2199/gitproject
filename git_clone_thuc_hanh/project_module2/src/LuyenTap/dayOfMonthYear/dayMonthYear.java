package LuyenTap.dayOfMonthYear;


import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class dayMonthYear{
    public static void main(String args[]) {
        Date date = new Date();
        String DATE_FORMAT = "yyyy/MM/dd";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        System.out.println("Today is " + sdf.format(date));
    }
}

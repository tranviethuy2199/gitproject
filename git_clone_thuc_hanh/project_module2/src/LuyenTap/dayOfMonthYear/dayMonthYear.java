package LuyenTap.dayOfMonthYear;


import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class dayMonthYear{
    public static void main(String args[]) {
//        Date date = new Date();
//        String DATE_FORMAT = "yyyy/MM/dd";
//        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
//        System.out.println("Today is " + sdf.format(date));
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
            System.out.println(strDate);
    }
}

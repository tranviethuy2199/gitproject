package LuyenTap.Candidate.Controller;

import LuyenTap.Candidate.Model.Information;
import LuyenTap.Candidate.Model.Student;

import java.util.Scanner;

public class CandidateTest {

    public static void main(String[] args) {
      System.out.println("Enter the number of candidates :");
       Scanner sc = new Scanner(System.in);
       int n;
        n = sc.nextInt();
        Information infor = new Information(n);

       System.out.println("Enter students information :" );
       infor.Input1();
       System.out.println("List information : ");
       infor.Output1();
       infor.pointList();
       System.out.println("Những thí sinh có tổng số điểm hơn 15 là : " );



  }
}
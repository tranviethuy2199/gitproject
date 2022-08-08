package ss5.practice.Candidate;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class TestCandidate {
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
            System.out.println("Những thí sinh có tổng số điểm hơn 15 là : ");
            infor.pointList();

    }
}

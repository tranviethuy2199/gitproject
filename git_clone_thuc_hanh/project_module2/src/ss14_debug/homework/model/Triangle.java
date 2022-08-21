package ss14_debug.homework.model;

import java.util.Scanner;

public class Triangle {
    double a, b, c;
    double canhAb = a +b ;
    double canhAc = a +c ;
    double canhBc = b + c ;
     public Triangle(double a,double b,double c) throws IllegalArgumentException {
         if (a <= 0 || b <= 0 || c <= 0) {throw new IllegalArgumentException("độ dài cạnh phải lớn hơn 0");}
         if (canhAb > c || canhAc > b || canhBc > a) {
             System.out.println("thỏa điều kiện");
//         }else {
////           throw new IllegalArgumentException("sai điều kiện , nhập lại chương trình");
         }
     }









    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

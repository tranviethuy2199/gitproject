package ss4_class_and_object.practice.Rectangle1;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }     // có thể khởi tạo các class giống nhau trong cùng jv

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return (this.width * this.height) * 2;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2 ;
    }
    public String display() {
        return "Rectangle{" + "width = " + width + ",{height=" + height + "}";
    }
}



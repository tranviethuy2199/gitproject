package ss4_class_and_object.homeWork.Fan;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {
//    Fan fan1 = new Fan();
//    Fan fan2 = new Fan(9, true, 30, "blue");
public static void main(String[] args) {
//    Fan fan1 = new Fan();
//    fan1.setSpeed(10);
//    fan1.setButton(true);
//    fan1.setRadius(5);
//    System.out.println(fan1.toString());

    Fan fan2 = new Fan();
    fan2.setButton(false);
    fan2.setRadius(5);
    fan2.setColor("blue");
    System.out.println(fan2.toString());

}

}


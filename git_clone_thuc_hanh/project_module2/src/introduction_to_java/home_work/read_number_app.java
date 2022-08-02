package introduction_to_java.home_work;

import java.util.Scanner;

public class read_number_app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int number = sc.nextInt();
        int unitsNumber = number % 10;
        int dozensNumber = number % 100 - unitsNumber;
        int hundredNumber = number % 1000 - dozensNumber - unitsNumber;
        String result = "";

        if (number > 0 && number < 1000) {
            switch (hundredNumber) {
                case 0:
                    result += "";
                    break;
                case 100:
                    result += "one hundred ";
                    break;
                case 200:
                    result += "two hundred ";
                    break;
                case 300:
                    result += "three hundred ";
                    break;
                case 400:
                    result += "four hundred ";
                    break;
                case 500:
                    result += "five hundred ";
                    break;
                case 600:
                    result += "six hundred ";
                    break;
                case 700:
                    result += "seven hundred ";
                    break;
                case 800:
                    result += "eight hundred ";
                    break;
                case 900:
                    result += "nine hundred ";
                    break;
            }
            switch (dozensNumber) {
                case 10:
                    result += "ten ";
                    break;
                case 20:
                    result += "twenty ";
                    break;
                case 30:
                    result += "thirty ";
                    break;
                case 40:
                    result += "forty ";
                    break;
                case 50:
                    result += "fifty ";
                    break;
                case 60:
                    result += "sixty ";
                    break;
                case 70:
                    result += "seventy ";
                    break;
                case 80:
                    result += "eighty ";
                    break;
                case 90:
                    result += "ninety ";
                    break;
            }
            switch (unitsNumber) {
//                case 0:
//                    result += "zero" ;
//                    break;
                case 1:
                    result += "one ";
                    break;
                case 2:
                    result += "two ";
                    break;
                case 3:
                    result += "three";
                    break;
                case 4:
                    result += "four ";
                    break;
                case 5:
                    result += "five";
                    break;
                case 6:
                    result += "six";
                    break;
                case 7:
                    result += "seven";
                    break;
                case 8:
                    result += "eight";
                    break;
                case 9:
                    result += "nine";
                    break;
            }
            System.out.println(result);
        } else {
                System.out.println("Please enter again");
            }
        }
    }


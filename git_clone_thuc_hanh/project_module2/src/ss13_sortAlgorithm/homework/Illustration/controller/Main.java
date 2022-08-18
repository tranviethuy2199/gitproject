package ss13_sortAlgorithm.homework.Illustration.controller;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter list size:");
            int size = scanner.nextInt();
            int[] list = new int[size];
            System.out.println("Enter " + list.length + " values:");
            for (int i = 0; i < list.length; i++) {
                list[i] = scanner.nextInt();
            }
            System.out.print("Your input list: ");
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + "\t");
            }
        }
        //codes below here
    }



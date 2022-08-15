package ss10_stack_queue.homework.invertElements.controller;

import ss10_stack_queue.homework.invertElements.model.InvertNumber;

import java.util.Arrays;

public class MainInteger {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(InvertNumber.reverseIntegerUseStack(array)));
    }
}
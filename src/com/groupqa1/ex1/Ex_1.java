package com.groupqa1.ex1;


import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        System.out.println("Enter number of elements of array: ");
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        if (length > 0) {
            int[] array = createArray(length);

            System.out.println("Array in direct order:");
            inDirectOrder(array);

            System.out.println("\nArray in reverse order:");
            inReverseOrder(array);
        } else {
            System.out.println("Invalid length!");
        }
    }

    static int[] createArray(int size) {
        int[] array = new int[size];
        int start = 0;
        int end = 100;

        for (int i = 0; i < array.length; i++) {
            array[i] = start + (int) (Math.random() * end) - 50;
        }
        return array;
    }

    static int[] inDirectOrder(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element [" + (i + 1) + "] " + array[i]);
        }
        return array;
    }

    static int[] inReverseOrder(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("Element [" + (i + 1) + "] " + array[i]);
        }
        return array;
    }
}

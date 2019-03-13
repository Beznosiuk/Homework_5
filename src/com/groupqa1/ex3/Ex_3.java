package com.groupqa1.ex3;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {

        System.out.println("Enter number of elements of array: ");
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        if (length > 0) {
            int[] firstArray = createArray(length);
            int[] secondArray = createArray(length);
            int[] finalArray = createFinalArray(firstArray, secondArray, length);

            System.out.println("First array: ");
            printArray(firstArray);

            System.out.println("\nSecond array: ");
            printArray(secondArray);

            System.out.println("\nFinal array: ");
            printArray(finalArray);

        } else {
            System.out.println("Invalid length!");
        }
    }

    static int[] createArray(int size) {
        int[] array = new int[size];
        int start = 0;
        int end = 30;

        for (int i = 0; i < array.length; i++) {
            array[i] = start + (int) (Math.random() * end) - 15;
        }
        return array;
    }

    static int[] printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element [" + i + "]   " + array[i]);
        }
        return array;
    }

    static int[] createFinalArray(int[] firstArray, int[] secondArray, int size) {
        int[] finalArray = new int[size];

        for (int i = 0; i < firstArray.length; i++) {
            finalArray[i] = firstArray[i] + secondArray[i];
        }
        return finalArray;
    }
}

package com.groupqa1.ex4;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        System.out.println("Enter number of elements of array: ");
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        if (length > 0) {
            int[] array = createArray(length);
            int[] arrayOfNegative = arrayOfNegativeElements(array, length);
            int[] arrayOfPositive = arrayOfPositiveElements(array, length);

            System.out.println("Array: ");
            printArray(array);

            System.out.println("Array of negative elements: ");
            printArrayOfNegative(arrayOfNegative);

            System.out.println("Array of positive elements: ");
            printArrayOfPositive(arrayOfPositive);

        } else {
            System.out.println("Invalid length!");
        }
    }

    static int[] createArray(int size) {
        int[] array = new int[size];
        int start = 0;
        int end = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = start + (int) (Math.random() * end) - 5;
        }
        return array;
    }

    static int[] printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element [" + i + "]   " + array[i]);
        }
        return array;
    }

    static int[] arrayOfNegativeElements(int[] array, int size) {
        int[] negativeArray = new int[size];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeArray[i] = array[i];
            }
        }
        return negativeArray;
    }

    static int[] printArrayOfNegative(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.println("Element [" + i + "]   " + array[i]);
            }
        }
        return array;
    }

    static int[] arrayOfPositiveElements(int[] array, int size) {
        int[] positiveArray = new int[size];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveArray[i] = array[i];
            }
        }
        return positiveArray;
    }

    static int[] printArrayOfPositive(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println("Element [" + i + "]   " + array[i]);
            }
        }
        return array;
    }
}



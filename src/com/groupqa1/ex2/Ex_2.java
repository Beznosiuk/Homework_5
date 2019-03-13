package com.groupqa1.ex2;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        System.out.println("Enter number of elements of array: ");
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        if (length > 0) {
            int[] array = createArray(length);
            System.out.println("Array: ");
            printArray(array);

            int counter = countsOfOdd(array);
            System.out.println("Counts of odd elements: " + counter);

            int sum = sumOfOdd(array);
            System.out.println("Sum of odd elements: " + sum);

        } else {
            System.out.println("Invalid length!");
        }
    }

    static int[] createArray(int size) {
        int[] array = new int[size];
        int start = 0;
        int end = 50;

        for (int i = 0; i < array.length; i++) {
            array[i] = start + (int) (Math.random() * end) - 25;
        }
        return array;
    }

    static int[] printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element [" + i + "]   " + array[i]);
        }
        return array;
    }

    static int countsOfOdd(int[] array) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    static int sumOfOdd(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}

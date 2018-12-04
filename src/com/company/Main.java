package com.company;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int resultThree = math(1346, 36);
        System.out.println(resultThree);

        boolean resultFour = isDivisibleThree(8);
        System.out.println(resultFour);

        boolean resultFive = isBelongToSection(7, 3, 12, 4, 29);
        System.out.println(resultFive);

        int[] array6 = {10, 50, 18, 193, 591, 561};
        reverseArray(array6);
        System.out.println(Arrays.toString(array6));

        int[] array7 = {1, 8, 1, 67, 52, 45, 257, 3571, 246, 23, 0, 919, 0};
        printMaxOfArray(array7);
    }

    // First task
    public static void firstTask(String[] args) {
        firstTask();
    }

    public static void firstTask() {
        int i = 573, j = -1;
        String myString = "J = ";
        System.out.println(myString + j);


    }


// Second task

    public static void secondTask(String[] args) {
        secondTask();
    }

    public static void secondTask() {
        double pi = 3.14159265358979f;
        System.out.println("PI = " + pi);
    }


    // Third Task

    public static void thirdTask(String[] args) {
        int result = math(1346, 36);
    }

    public static int math(int secondInt, int firstInteger) {
        return secondInt + firstInteger;

    }

    // Fourth Task

    static boolean isDivisibleThree(int num) {
        if (num % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Fifth Task

    static boolean isBelongToSection(int x, int fromA, int toB, int fromSecondA, int toSecondB) {
        if (x > fromA && x < toB || x > fromSecondA && x < toSecondB) {
            return true;
        } else
            return false;
    }

    // Sixth Task
    static void reverseArray(int[] someArray) {
        for (int i = 0; i < someArray.length / 2; i++) {
            int tmp = someArray[someArray.length - i - 1];
            someArray[someArray.length - i - 1] = someArray[i];
            someArray[i] = tmp;
        }
    }

    // Seventh Task
    static void printMaxOfArray(int[] array) {
        int maxElement = array[0];
        for (int index = 1; index <= array.length - 1; index++) {
            if (array[index] > maxElement) {
                maxElement = array[index];
            }
        }
        System.out.println("Max " + maxElement);

    }

}


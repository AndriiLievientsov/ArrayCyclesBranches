package com.company;

import java.util.Arrays;
import java.util.Random;

public class PartTwo {
    public static void main(String[] args) {
        //## Часть 2
        /*1. Посчитать среднее арифметическое массива чисел. */
        System.out.println("Задача 1");
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println("Array: ");
        System.out.println(Arrays.toString(array1));
        double average;
        double sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        average = sum / array1.length;
        System.out.println("Arithmetic mean of array: " + average);
        System.out.println();

        /*2. Найти максимальный и минимальный элементы массива.*/
        System.out.println("Задача 2");
        int[] array2 = new int[10];
        Random random = new Random();
        System.out.println("Array: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(110);
            System.out.print(array2[i] + " ");
        }
        int min = array2[0];
        int max = array2[0];
        for (int j = 0; j < array2.length; j++) {
            if (min > array2[j]) {
                min = array2[j];
            }
            if (max < array2[j]) {
                max = array2[j];
            }
        }
        System.out.println("\n" + "Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println();

        /*3. Найти повторяющиеся элементы в массиве.*/
        System.out.println("Задача 3");
        int[] array3 = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Array: ");
        System.out.println(Arrays.toString(array3));
        System.out.println("Repeated elements in an array: ");

        for (int i = 0; i < array3.length; i++) {
            for (int j = i + 1; j < array3.length; j++) {
                if (array3[i] == array3[j])
                    System.out.print(array3[j] + " ");
            }
        }
        System.out.println("\n");

        /* 4. Найти второе наибольшее значение в массиве.*/
        System.out.println("Задача 4");
        int[] array4 = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412};
        int maxValue = 0;
        int secondLargest = 0;
        for (int i = 1; i < array4.length; i++) {
            if (array4[i] > maxValue) {
                secondLargest = maxValue;
                maxValue = array4[i];
            } else if (array4[i] > secondLargest) {
                secondLargest = array4[i];
            }
        }
        System.out.println("Array: " + "\n" +
                Arrays.toString(array4));
        System.out.println("Second highest value in the array: " + secondLargest);
        System.out.println(" ");

        /*5. Найти второе наименьшее значение в массиве.*/
        System.out.println("Задача 5");
        int[] array5 = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] < smallest) {
                secondSmallest = smallest;
                smallest = array5[i];
            } else if (array5[i] < secondSmallest) {
                secondSmallest = array5[i];
            }
        }
        System.out.println("Array: " + "\n" +
                Arrays.toString(array5));
        System.out.println("Second smallest value in the array: " + secondSmallest);
        System.out.println(" ");

        /*6. Найти повторяющиеся значения в двух массивах. */
        System.out.println("Задача 6");
        int[] array6 = {1, 1, 34, 5, 4, 348, 67, 5, 7, 123, 345, 128, 22};
        int[] array7 = {233, 465, 3, 3, 123, 33, 67, 78, 56, 125, 33, 126, 2};
        int[] array8 = new int[array6.length + array7.length];
        int count = 0;
        for (int i = 0; i < array6.length; i++) {
            array8[i] = array6[i];
            count++;
        }
        for (int j = 0; j < array7.length; j++) {
            array8[count++] = array7[j];
        }
        System.out.println(Arrays.toString(array8));
        System.out.println("Repeating values in two arrays: ");
        for (int i = 0; i < array8.length; i++) {
            for (int j = i + 1; j < array8.length; j++) {
                if (array8[i] == array8[j])
                    System.out.print(array8[j] + " ");
            }
        }
        System.out.println("\n");

        /*7. Найти не повторяющиеся значения в двух массивах.*/
        System.out.println("Задача 7");
        int[] array9 = {1, 1, 34, 5, 4, 348, 67, 5, 7, 123, 345, 128, 22};
        int[] array10 = {233, 465, 3, 3, 123, 33, 67, 78, 56, 125, 33, 126, 2};
        int[] array11 = new int[array9.length + array10.length];
        int count2 = 0;
        for (int i = 0; i < array9.length; i++) {
            array11[i] = array9[i];
            count2++;
        }
        for (int j = 0; j < array10.length; j++) {
            array11[count2++] = array10[j];
        }
        System.out.println(Arrays.toString(array11));
        System.out.println("Non-repeating values in two arrays: ");

        for (int i = 0; i < array11.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array11.length; j++) {
                if (i != j && array11[i] == array11[j]) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                System.out.print(array11[i] + " ");
            }
        }


    }
}
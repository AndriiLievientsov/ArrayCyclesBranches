package com.company;

import java.util.Arrays;
import java.util.Random;

public class Part2 {
    public static void main(String[] args) {
       //## Часть 2
        /*1. Посчитать среднее арифметическое массива чисел. */
        System.out.println("Задача 1");
        int [] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random()* 10) + 1;
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
        for (int i = 0; i <array2.length ; i++) {
            array2[i] = random.nextInt(110);
            System.out.print(array2[i]+" ");
        }
        int min = array2[0];
        int max = array2[0];
        for (int j = 0; j <array2.length ; j++) {
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
        int [] array3 = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Array: ");
        System.out.println(Arrays.toString(array3));
        System.out.println("Repeated elements in an array: ");

        for(int i = 0; i < array3.length; i++) {
            for(int j = i + 1; j < array3.length; j++) {
                if(array3[i] == array3[j])
                    System.out.print(array3[j]+ " ");
            }
        }
        System.out.println();








    }
}

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //## Часть 1
        //1.   Создайте массив интов без указания значений элементов при создании объекта.
        int[] array1 = new int[5];

        //2.   Создайте массив интов с указанием значений элементов при создании объекта.
        int[] array2 = {1, 2, 3, 4, 5};

        //3.   Создайте пустой массив интов. Заполните его любыми значениями.
        int[] array3 = new int[3];
        array3[0] = 17;
        array3[1] = 6;
        array3[2] = 55;

        //4.   Создайте пустой массив даблов. Заполните его любыми значениями и выведите в консоль содержимое.
        double[] array4 = new double[3];
        array4[0] = 5.12;
        array4[1] = 2.1;
        array4[2] = 10.97;
        System.out.println("Задача 4");
        System.out.println("Double array: " + "\n"
                + Arrays.toString(array4) + "\n");

        //5.   Создайте пустой массив на 10 элементов. Заполните значения элементов.
        // Расширьте массив на 5 элементов.
        System.out.println("Задача 5");
        int[] array5 = new int[]{77, 34, 9, 214, 99, 100, 5, 37, 4, 1};
        System.out.println("Original array:");
        for (int a : array5) {
            System.out.print(a + " ");
        }
        int[] array6 = new int[15];
        System.arraycopy(array5, 0, array6, 0, array5.length);
        System.out.println("\n" + "Extended array:");
        for (int a : array6) {
            System.out.print(a + " ");
        }
        System.out.println("\n");

    /*6.   Создайте массив из 12 случайных целых чисел из отрезка `[-15;15]`.
           Определите какой элемент является в этом массиве максимальным
           и сообщите индекс его последнего вхождения в массив. */
        System.out.println("Задача 6");
        int[] array7 = new int[12];
        int maxNumber = -16;
        int maxIndex = 0;
        System.out.println("Random array:");
        for (int i = 0; i < array7.length; i++) {
            array7[i] = ((int) (Math.random() * 31) - 15);
            System.out.print(array7[i] + " ");
            if (maxNumber <= array7[i]) {
                maxNumber = array7[i];
                maxIndex = i;
            }
        }
        System.out.println("\n" + "Maximum element index: " + maxIndex + "\n");

    /*7.   Создайте массив из 8 случайных целых чисел из отрезка `[1;10]`.
    Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
    Снова выведете массив на экран на отдельной строке.*/
        System.out.println("Задача 7");
        int[] array8 = new int[8];
        for (int i = 0; i < array8.length; i++) {
            array8[i] = ((int) (Math.random() * 10) + 1);
        }
        System.out.println("Primary array:");
        System.out.println(Arrays.toString(array8));
        for (int i = 0; i < array8.length; i++) {
            if (i % 2 == 1) {
                array8[i] = 0;
            }
        }
        System.out.println("Modified array:");
        System.out.println(Arrays.toString(array8) + "\n");

        /* 8.   Создайте массив из 4 случайных целых чисел из отрезка `[10;99]`.
         Выведите его на экран в строку. Далее определите и выведите на экран сообщение о том,
         является ли массив строго возрастающей последовательностью.*/
        System.out.println("Задача 8");
        int[] array9 = new int[4];
        for (int i = 0; i < array9.length; i++) {
            array9[i] = (int) (Math.random() * 90) + 10;
        }
        System.out.println("Array of 4 random integers from the segment `[10;99]`:");
        System.out.println(Arrays.toString(array9));

        boolean flag = true;
        for (int i = 1; i < array9.length; i++) {
            if (array9[i] <= array9[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Array is a strictly ascending sequence of");
        } else {
            System.out.println("Array is not a strictly ascending sequence");
        }
        System.out.println();

        /*9.   Создайте 2 массива из 5 случайных целых чисел из отрезка `[0;5]` каждый.
        Выведите массивы на экран в двух отдельных строках.
        Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов
         это значение оказалось больше (либо сообщите, что их средние арифметические равны).
         */
        System.out.println("Задача 9");
        double sumArray10 = 0;
        double sumArray11 = 0;
        int[] array10 = new int[5];
        System.out.println("The first array of 5 random integers from the segment `[0;5]`:");
        for (int i = 0; i < array10.length; i++) {
            array10[i] = (int) (Math.random() * 6);
            System.out.print(array10[i] + " ");
            sumArray10 += (double) array10[i]/ array10.length;
        }
        System.out.println(" ");
        int[] array11 = new int[5];
        System.out.println("A second array of 5 random integers from the segment `[0;5]`:");
        for (int i = 0; i < array11.length; i++) {
            array11[i] = (int) (Math.random() * 6);
            System.out.print(array11[i] + " ");
            sumArray11 += (double) array11[i]/ array11.length;
        }
        System.out.print("\n" + "About the array: ");
        if(sumArray10==sumArray11)
            System.out.println("The arithmetic mean values of the two arrays are");
        else {
            if (sumArray10 > sumArray11)
                System.out.println("The arithmetic mean of the first array is greater than and equal");
            else System.out.println("The arithmetic mean of the second array is greater than and equal");
        }
        System.out.println();

        /*Создать массив из 50 случайных целых чисел из отрезка `[0;1000]` и вывести его на экран.
         Создать второй массив только из чётных элементов первого массива, если они там есть,
         и вывести его на экран. */
        System.out.println("Задача 10");
        int[] array12 = new int[50];
        for (int i = 0; i < array12.length; i++) {
            array12[i] = (int) (Math.random() * 1000);
        }



    }
}


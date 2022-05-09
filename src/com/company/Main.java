package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	//1.   Создайте массив интов без указания значений элементов при создании объекта.
        int[] array1;

    //2.   Создайте массив интов с указанием значений элементов при создании объекта.
        int[] array2 = {1, 2, 3, 4, 5};

    //3.   Создайте пустой массив интов. Заполните его любыми значениями.
        int[] array3 = new int[10];

    //4.   Создайте пустой массив даблов. Заполните его любыми значениями и выведите в консоль содержимое.
        double[] array4 = new double[3];
        array4 [0] = 5.12;
        array4 [1] = 2.1;
        array4 [2] = 10.97;
        System.out.println("Double array: " + "\n"
                + Arrays.toString(array4) + "\n");

    //5.   Создайте пустой массив на 10 элементов. Заполните значения элементов. Расширьте массив на 5 элементов.
        int[] array5 = new int[]{77,34,9,214,99,100,5,37,4,1};
        System.out.println("Original array:");
        for (int a: array5){
            System.out.print(a + " ");
        }
        int[] array6 = new int[15];
        System.arraycopy(array5, 0, array6, 0, array5.length);
        System.out.println("\n" + "Extended array:");
        for (int a: array6){
            System.out.print(a+" ");
        }
        System.out.println("\n");

    /*6.   Создайте массив из 12 случайных целых чисел из отрезка `[-15;15]`.
           Определите какой элемент является в этом массиве максимальным
           и сообщите индекс его последнего вхождения в массив. */
        int[] array7 = new int[12];
        int maxNumber = -16;
        int maxIndex = 0;
        System.out.println("Random array:");
        for (int i = 0; i < array7.length; i++) {
            array7[i] = ((int)(Math.random() * 31) - 15);
            System.out.print(array7[i]+" ");
            if (maxNumber <= array7[i]){
                maxNumber = array7[i];
                maxIndex = i;
            }
        }
        System.out.println("\n" + "Maximum element index: " + maxIndex + "\n");

    /*7.   Создайте массив из 8 случайных целых чисел из отрезка `[1;10]`.
    Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
    Снова выведете массив на экран на отдельной строке.*/
        int[] array8 = new int[8];
        for (int i = 0; i <array8.length ; i++) {
            array8[i] = ((int)(Math.random() * 10) + 1);
        }
        System.out.println("Primary array:");
        System.out.println(Arrays.toString(array8));
        for (int i = 0; i <array8.length ; i++) {
            if (i % 2 == 1) {
                array8[i] = 0;
            }
        }
        System.out.println("Modified array:");
        System.out.println(Arrays.toString(array8)+"\n");

        /* 8.   Создайте массив из 4 случайных целых чисел из отрезка `[10;99]`.
         Выведите его на экран в строку. Далее определите и выведите на экран сообщение о том,
         является ли массив строго возрастающей последовательностью.*/
        int[] array9 = new int[4];
        for (int i = 0; i <array9.length ; i++) {
            array9[i] = ((int)(Math.random() * 90) + 10);
        }
        System.out.println("array:");
        System.out.println(Arrays.toString(array9));

    }
}

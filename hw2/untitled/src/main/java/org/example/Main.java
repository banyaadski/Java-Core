package org.example;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = createArr();
        int[] array = new int[]{2, 3, 5, 7, 0, 6,0, 8};
//        task1(arr);
//        task2(arr);
        System.out.println( task3(array));
    }

    public static int[] createArr() {
        Random random = new Random();
        int[] arrNew = new int[10];
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i] = random.nextInt(1, 20);
        }
        return arrNew;
    }

    // Написать метод, возвращающий количество чётных элементов массива.
    // countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0.
    public static void task1(int[] arr) {
        int even = 0;
        for (int j : arr) {
            System.out.format(" %s ", j);
            if (j % 2 == 0) {
                even += 1;
            }
        }
        System.out.format("Всего чётных элементов %s", even);
    }

    //Написать функцию,
    //возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.

    public static void task2(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int result = 0;

        for (int j : arr) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
        }

        result = max - min;
        System.out.format("Максимально число - %s, минимальное число - %s, а их разница %s", max, min, result);
    }

    //    Написать функцию, возвращающую истину,
//    если в переданном массиве есть два соседних элемента, с нулевым значением.
    public static boolean task3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== 0) {
                if (arr[i]==arr[i+1]){
                    return true;
                }
            }

        }
        return false;
    }

}



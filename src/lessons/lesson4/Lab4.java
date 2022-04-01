package lessons.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        System.out.println("---- Задание 1 ----");
        System.out.print("Array length: ");
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        int len1 = in.nextInt();
        int[] array1 = new int[len1];
        System.out.println("Numbers of array: ");
        for (int i = 0; i < len1; i++) {
            array1[i] = in.nextInt();
        }
        for (int i = 0; i < len1 - 1; i++) {
            if (array1[i] > array1[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }

        System.out.println("---- Задание 2 ----");
        System.out.print("Array length: ");
        int len2 = in.nextInt();
        int[] array2 = new int[len2];
        System.out.println("Numbers of array: ");
        for (int i = 0; i < len2; i++) {
            array2[i] = in.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(array2));

        System.out.println("---- Задание 3 ----");
        System.out.print("Array length: ");
        int len3 = in.nextInt();
        int[] array3 = new int[len3];
        System.out.println("Numbers of array: ");
        for (int i = 0; i < len3; i++) {
            array3[i] = in.nextInt();
        }
        System.out.println("Array 1 : " + Arrays.toString(array3));
        int element = array3[0];
        array3[0] = array3[len3 - 1];
        array3[len3 - 1] = element;
        System.out.println("Array 2 : " + Arrays.toString(array3));

        System.out.println("---- Задание 4----");
        System.out.print("Array length: ");
        int len4 = in.nextInt();
        int[] array4 = new int[len4];
        System.out.println("Numbers of array: ");
        for (int i = 0; i < len4; i++) {
            array4[i] = in.nextInt();
        }
        in.close();
        System.out.println("Result: " + Arrays.toString(array4));
        flag = true;
        for (int element1 : array4) {
            int numEqualElements = 0;
            for (int element2 : array4) {
                if (element1 == element2) {
                    numEqualElements++;
                }
            }
            if (numEqualElements == 1) {
                System.out.println("Первый уникальный элемент в массиве: " + element1);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("В массиве нет уникальных элементов");
        }

        System.out.println("---- Задание 5. Пузырьковая сортировка.----");
        int start = 0;
        int end = 1000;
        boolean isSorted = true;
        int len5 = 2 + (int) (Math.random() * 8);
        int[] array5 = new int[len5];
        for (int i = 0; i < len5; i++) {
            array5[i] = start + (int) (Math.random() * end);
        }
        System.out.println("Result: " + Arrays.toString(array5));
        while (isSorted) {
            isSorted = false;
            for (int i = 0; i < len5 - 1; i++) {
                if (array5[i] > array5[i + 1]) {
                    isSorted = true;
                    int elem = array5[i];
                    array5[i] = array5[i + 1];
                    array5[i + 1] = elem;
                }
            }
        }
        System.out.println("Sort result: " + Arrays.toString(array5));
    }
}


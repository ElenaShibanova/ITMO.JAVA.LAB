package lessons.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2 {
    public static void task1() {
        System.out.println("\n---- Задание 1 ----");
        int i = 1;
        while (i <= 99) {
            System.out.println(i);
            i += 2;
        }
    }

    public static void task2() {
        System.out.println("\n---- Задание 2 ----");
        System.out.print("Делится на 3: ");
        int i = 3;
        while (i <= 100) {
            System.out.print(i + " ");
            i += 3;
        }
        System.out.print("\nДелится на 5: ");
        i = 5;
        while (i <= 100) {
            System.out.print(i + " ");
            i += 5;
        }
        System.out.print("\nДелится и на 3,и на 5: ");
        i = 15;
        while (i <= 100) {
            System.out.print(i + " ");
            i += 15;
        }
    }

    public static boolean task3() {
        System.out.println("\n---- Задание 3 ----");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first = in.nextInt();
        System.out.print("Введите второе число: ");
        int second = in.nextInt();
        System.out.print("Введите третье число: ");
        int third = in.nextInt();
        if (first + second == third) {
            return true;
        }
        return false;
    }

    public static boolean task4() {
        System.out.println("\n---- Задание 4 ----");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first = in.nextInt();
        System.out.print("Введите второе число: ");
        int second = in.nextInt();
        System.out.print("Введите третье число: ");
        int third = in.nextInt();
        if (first < second && second < third) {
            return true;
        }
        return false;
    }

    public static boolean task5() {
        System.out.println("\n---- Задание 5 ----");
        int[] array1 = new int[]{7, 7, 6, 5, 4, 33, 4, 5, 3};
        System.out.println("array = " + Arrays.toString(array1));
        if (array1[0] == 3 || array1[array1.length - 1] == 3) {
            return true;
        }
        return false;
    }

    public static void task6() {
        System.out.println("\n---- Задание 6 ----");
        System.out.println("Введите размерность массива целых чисел.\nРазмерность больше или равна 2.");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array2 = new int[n];
        if (n < 2) {
            System.out.println("Некорректный ввод. Размерность должна быть больше или равна 2.");
        } else {
            System.out.println("Введите элементы массива");
            for (int i = 0; i < n; i++) {
                array2[i] = in.nextInt();
            }
            for (int element : array2) {
                if (element == 1 || element == 3) {
                    System.out.println("Массив содержит 1 или 3");
                    return;
                }
            }
            System.out.println("Массив не содержит ни 1, ни 3");
        }
    }
}
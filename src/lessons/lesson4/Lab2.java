package lessons.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        System.out.println("---- Задание 1 ----");
        int i = 1;
        while (i <= 99) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("---- Задание 2 ----");
        System.out.print("Делится на 3: ");
        i = 3;
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
        System.out.println("\n---- Задание 3 ----");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first = in.nextInt();
        System.out.print("Введите второе число: ");
        int second = in.nextInt();
        System.out.print("Введите третье число: ");
        int third = in.nextInt();
        //in.close();
        if (first + second == third) {
            System.out.println(true);
        }
        System.out.println("---- Задание 4 ----");
        // in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        first = in.nextInt();
        System.out.print("Введите второе число: ");
        second = in.nextInt();
        System.out.print("Введите третье число: ");
        third = in.nextInt();
        if (first < second && second < third) {
            System.out.println(true);
        }
        System.out.println("---- Задание 5 ----");
        int[] array1 = new int[]{7, 7, 6, 5, 4, 33, 4, 5, 3};
        System.out.println("array = " + Arrays.toString(array1));
        if (array1[0] == 3 || array1[array1.length - 1] == 3) {
            System.out.println(true);
        }
        System.out.println("---- Задание 6 ----");
        System.out.println("Введите размерность массива целых чисел.\nРазмерность больше или равна 2.");
        boolean flag = false;
        int n = in.nextInt();
        int[] array2 = new int[n];
        if (n < 2) {
            System.out.println("Некорректный ввод. Размерность должна быть больше или равна 2.");
        } else {

            System.out.println("Введите элементы массива");
//          for (int element : array2) {
//            element = in.nextInt();
//            if (element==1 || element==3){
//                flag = true;
//            }
//          }
            for (i = 0; i < n; i++) {
                array2[i] = in.nextInt();
                if (array2[i] == 1 || array2[i] == 3) {
                    flag = true;
                }
            }
            in.close();
            System.out.println("array = " + Arrays.toString(array2));
            if (flag) {
                System.out.println("Массив содержит 1 или 3");
            } else {
                System.out.println("Массив не содержит ни 1, ни 3");
            }
        }

    }
}
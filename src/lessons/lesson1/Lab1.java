package lessons.lesson1;

import java.io.*;
import java.util.Scanner;

public class Lab1 {
    public static void Task1234() {
        System.out.println("----Задания 1, 2, 3, 4----");
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

        System.out.println((46 + 10) * (10.0 / 3));
        System.out.println(29 * 4 * (-15));

        int number = 10500;
        double result = number / 10.0 / 10;
        System.out.println(result);

        double resultMulti = 3.6 * 4.1 * 5.9;
        System.out.println(resultMulti);
    }

    public static void Task5() {
        System.out.println("----Задание 5----");
        String inputLine1 = null;
        String inputLine2 = null;
        String inputLine3 = null;
        System.out.println("Введите три целых числа:");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine1 = is.readLine();
            inputLine2 = is.readLine();
            inputLine3 = is.readLine();
        } catch (IOException e) {
            System.out.println("IOException:" + e);
        }
        System.out.println(inputLine1 + "\n" + inputLine2 + "\n" + inputLine3);
//        int first = Integer.parseInt(firststr);

    }

    public static void Task6() {
        System.out.println("----Задание 6----");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число:\nb=");
        int b = in.nextInt();
        in.close();
        if (b % 2 == 1) {
            System.out.println("Нечётное");
        } else if (b <= 100) {
            System.out.println("Чётное");
        } else {
            System.out.println("Выход за пределы диапазона");
        }
    }
}

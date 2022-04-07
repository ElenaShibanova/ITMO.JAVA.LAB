package lessons.lesson6.task5;

import java.util.Scanner;

public class Parent {
    private int age;
    public Scanner in = new Scanner(System.in);

    public void setInfo() {
        System.out.println("Введите целое число:");
        age = in.nextInt();
    }

    public int getAge() {
        return age;
    }

}

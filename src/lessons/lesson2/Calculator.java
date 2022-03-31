package lessons.lesson2;

public class Calculator {
    public int sum(int x, int y) {
        System.out.println("Сумма целых чисел");
        return x + y;
    }

    public long sum(long x, long y) {
        System.out.println("Сумма чисел типа Long");
        return x + y;
    }

    public double sum(double x, double y) {
        System.out.println("Сумма действительных чисел");
        return x + y;
    }

    public int subtraction(int x, int y) {
        System.out.println("Разность целых чисел");
        return x - y;
    }

    public long subtraction(long x, long y) {
        System.out.println("Разность чисел типа Long");
        return x - y;
    }

    public double subtraction(double x, double y) {
        System.out.println("Разность действительных чисел");
        return x - y;
    }

    public int multiplication(int x, int y) {
        System.out.println("Произведение целых чисел");
        return x * y;
    }

    public long multiplication(long x, long y) {
        System.out.println("Произведение чисел типа long");
        return x * y;
    }

    public double multiplication(double x, double y) {
        System.out.println("Произведение действительных чисел");
        return x * y;
    }

    public double division(int x, int y) {
        System.out.println("Частное целых чисел");
        return 1.0 * x / y;
    }

    public double division(long x, long y) {
        System.out.println("Частное чисел типа long");
        return 1.0 * x / y;
    }

    public double division(double x, double y) {
        System.out.println("Частное действительных чисел");
        return x / y;
    }
}

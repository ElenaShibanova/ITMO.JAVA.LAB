package lessons.lesson2;

public class Calculator {
    public int Sum(int x, int y) {
        System.out.println("Сумма целых чисел");
        return x + y;
    }

    public long Sum(long x, long y) {
        System.out.println("Сумма чисел типа Long");
        return x + y;
    }

    public double Sum(double x, double y) {
        System.out.println("Сумма действительных чисел");
        return x + y;
    }

    public int Subtraction(int x, int y) {
        System.out.println("Разность целых чисел");
        return x - y;
    }

    public long Subtraction(long x, long y) {
        System.out.println("Разность чисел типа Long");
        return x - y;
    }

    public double Subtraction(double x, double y) {
        System.out.println("Разность действительных чисел");
        return x - y;
    }

    public int Multiplication(int x, int y) {
        System.out.println("Произведение целых чисел");
        return x * y;
    }

    public long Multiplication(long x, long y) {
        System.out.println("Произведение чисел типа long");
        return x * y;
    }

    public double Multiplication(double x, double y) {
        System.out.println("Произведение действительных чисел");
        return x * y;
    }

    public double Division(int x, int y) {
        System.out.println("Частное целых чисел");
        return 0.1 * x / y;
    }

    public double Division(long x, long y) {
        System.out.println("Частное чисел типа long");
        return 0.1 * x / y;
    }

    public double Division(double x, double y) {
        System.out.println("Частное действительных чисел");
        return x / y;
    }
}

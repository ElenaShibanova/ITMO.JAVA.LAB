package lessons.lesson2;

public class TestCalculator{
    public static void main(String[] args)  throws Exception
    {

        Calculator calc = new Calculator();
        int sum1 = calc.sum(1,5);
        System.out.println(sum1);
        double sum2 = calc.sum( 1.5,-9);
        System.out.println(sum2);
        double divD = calc.division(9.0,0);
        System.out.println(divD);

    }
}

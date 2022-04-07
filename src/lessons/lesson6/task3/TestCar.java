package lessons.lesson6.task3;

public class TestCar {
    public static void main(String[] args) {
        Truck truck = new Truck(7000, "Kamaz", 'w', 90, 6,9000);
        truck.outPut();
        truck.newWheels(8);
    }
}

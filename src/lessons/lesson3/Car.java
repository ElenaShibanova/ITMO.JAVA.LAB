package lessons.lesson3;

public class Car {
    private String color;
    private String name;
    private double weight;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public Car(String color,String name, double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }
    public String printCar() {
        return "Название: " + name + "; Цвет: " + color + "; Вес: " + weight;

    }
}

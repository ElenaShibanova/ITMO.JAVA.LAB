package lessons.lesson3;

import java.util.Calendar;

public class House {
    private int numberOfFloors;
    private int yearOfConstruction;
    private String name;

    public House() {
    }
    void setHouse(int number, int year, String name) {
        numberOfFloors = number;
        yearOfConstruction = year;
        this.name = name;
    }
    public String getHouse() {
        return "Количество этажей: " + numberOfFloors + "; Год постройки: " + yearOfConstruction + "; Наименование: " + name;
    }
    public int numberOfYears(){
        Calendar calendar = Calendar.getInstance();
        return  calendar.get(Calendar.YEAR) - yearOfConstruction;
    }
}

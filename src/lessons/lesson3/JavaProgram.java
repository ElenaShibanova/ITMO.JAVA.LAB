package lessons.lesson3;

public class JavaProgram {
    public static void main(String[] args) {
        System.out.println("----Тест класса Study----");
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        System.out.println("----Тест класса Car----");
        Car car1 = new Car("Жёлтый","Chevrolet",2.5);
        Car car2 = new Car("Чёрный","Tesla",3);
        System.out.println(car1.printCar());
        System.out.println(car2.printCar());

        System.out.println("----Тест класса House----");
        House house1 = new House();
        House house2 = new House();
        house1.setHouse(2,1985,"Коттедж");
        house2.setHouse(103,2000,"Небоскрёб");
        System.out.println(house1.getHouse());
        System.out.println(house2.getHouse());
        System.out.println(house1.numberOfYears());
        System.out.println(house2.numberOfYears());

        System.out.println("----Тест класса Tree----");
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(35,"клён");
        Tree tree3 = new Tree(150,"дуб", true);
        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}

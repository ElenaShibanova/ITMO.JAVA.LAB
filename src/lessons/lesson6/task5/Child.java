package lessons.lesson6.task5;

public class Child extends Parent {
    private String name;

    @Override
    public void setInfo() {
        System.out.println("Введите имя пользователя:");
        name = in.nextLine();
    }

    public String getName() {
        return name;
    }
}

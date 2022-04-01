package lessons.lesson3;

public class Tree {
    private int age;
    private boolean alive;
    private String title;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал.");
    }


    public Tree(int age, String title) {
        this.age = age;
        this.title = title;
    }
    public Tree(int age, String title, boolean alive) {
        this.age = age;
        this.title = title;
        this.alive = alive;
    }
    @Override
    public String toString() {
        String live = "живое дерево";
        if(alive == false){
            live = "неживое дерево";
        }
        return "возраст: " + age + "; " + live + "; название: " + title;

    }
}

package lessons.lesson2;


public class TestBook {
    public static void main(String[] args)
    {
        Book book1 = new Book();
        Book book2 = new Book("Маугли");
        Book book3 = new Book("Шерок Холмс", "А. К. Дойл");
        Book book4 = new Book("Руслан и Людмила", "А.С.Пушкин", 1983);
        System.out.println(book2);
        System.out.println(book3.getYear());
        System.out.println(book4.getTitle());

    }
}

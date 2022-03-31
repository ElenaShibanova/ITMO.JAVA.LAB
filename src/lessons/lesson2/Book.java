package lessons.lesson2;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }
    int getYear(){
        return year;
    }
    @Override
    public String toString(){
        return "Название: "+ title +"; Автор: " + author + "; Год издания: " + year;

    }

}

class Book {
    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    void display() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }
}

public class Que3{
    public static void main(String[] args) {
        Book b = new Book("Java Programming", "Prabh");
        b.display();
    }
}
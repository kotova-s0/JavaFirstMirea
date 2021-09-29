package ru.mirea.task3;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        String name;
        int date;
        String author;
        String genre;

        Book book = new Book();
        Scanner scan = new Scanner(System.in);
        System.out.println("name: ");
        name = scan.next();
        System.out.println("date: ");
        date = scan.nextInt();
        System.out.println("author: ");
        author = scan.next();
        System.out.println("genre: ");
        genre = scan.next();

        book.setAuthor(author);
        book.setDate(date);
        book.setGenre(genre);
        book.setName(name);

        System.out.println(book.getAuthor());
        System.out.println(book.getDate());
        System.out.println(book.getGenre());
        System.out.println(book.getName());
    }
}

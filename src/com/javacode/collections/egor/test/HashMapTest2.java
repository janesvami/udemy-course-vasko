package com.javacode.collections.egor.test;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class HashMapTest2 {
    public static void main(String[] args) {

        Book book1 = new Book(4342, "Над пропастью во ржи", "Джером Сэлинджер");
        Book book2 = new Book(2324, "Война и мир", "Лев Толстой");
        Book book3 = new Book(2232, "Дом, в котором...", "Мариам Петросян");
        Book book4 = new Book(335, "Избранник", "Мариам Петросян");
        Book book5 = new Book(6565, "Хроники Нарнии", "Клайв Льюис");

        Library library = new Library();

        library.removeByID(4342);
        library.putNewBook(book3);
        library.putNewBook(book5);
        library.putNewBook(book4);
        library.putNewBook(book1);
        library.putNewBook(book2);
        int id = 335;
        Optional<Book> found = library.getByID(id);
        found.ifPresentOrElse((book) -> {
            System.out.println("По ID " + id + " найдена книга " + book);
        }, () -> {
            System.out.println("Книги с ID " + id + " в библиотеке нет.");
        });

//        if (optFoundBook.isPresent()) {
//            Book foundBook = optFoundBook.get();
//            System.out.println("По ID " + foundBook.id() + " найдена книга " + foundBook);
//        } else {
//            System.out.println("Такой книги в библиотеке нет.");
//        }


        library.removeByID(4342);

        Optional<Book> book = library.getByID(4342);
        System.out.println(book);
        library.removeByID(2324);
        System.out.println("...");
        List<Book> oneAuthorBooks = library.getByAuthor("54432");
        printList(oneAuthorBooks);
        System.out.println("...");
        List<Book> allBooks = library.getAllBooks();
        printList(allBooks);


    }

    public static void printList(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }


}

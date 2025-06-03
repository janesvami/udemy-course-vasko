package com.javacode.collections.egor.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class Library {

    private final HashMap<Integer, Book> books = new HashMap<>();

    public Optional<Book> getByID(int id) {

            Optional<Book> book = Optional.ofNullable(books.get(id));
            return book;
        }


    public void removeByID(int id) {
        books.remove(id);
        System.out.println("Книга успешно удалена из библиотеки.");
    }

    public void putNewBook(Book book) {
        if (book == null) {
            System.out.println("Невозможно добавить такую книгу.");
        } else if (books.containsKey(book.id())) {
            System.out.println("Такая книга уже есть в библиотеке.");
        } else {
            books.put(book.id(), book);
            System.out.println("Книга " + book + " успешно добавлена в библиотеку.");
        }
    }

    public List<Book> getAllBooks() {
        List<Book> allBooks = new ArrayList<>();
        for (HashMap.Entry<Integer, Book> entry : books.entrySet()) {
            Book book = entry.getValue();
            allBooks.add(book);
        }
        return allBooks;
    }


    public List<Book> getByAuthor(String author) {
        List<Book> oneAuthorsBooks = new ArrayList<>();
        for (HashMap.Entry<Integer, Book> entry : books.entrySet()) {
            Book book = entry.getValue();
            if (book.author().equals(author)) {
                oneAuthorsBooks.add(book);
            } else if (author == null) {
                System.out.println("Что-то пошло не так.");
            }
        }
        if (oneAuthorsBooks.isEmpty()) {
            System.out.println("Книг автора " + author + " в библиотеке нет.");
        }
        return oneAuthorsBooks;
    }

}

package com.epam.book;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private final List<Book> books;

    public BookService(List<Book> books) {
        this.books = books;
    }

    public List<Book> booksByAuthor(String author) {
        List<Book> booksByAuthorList = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                booksByAuthorList.add(book);
            }
        }
        return booksByAuthorList;
    }

    public List<Book> booksByPublishHouse(String publishHouse) {
        List<Book> booksByHouseList = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublisher().getType().equals(publishHouse)) {
                booksByHouseList.add(book);
            }
        }
        return booksByHouseList;
    }

    public List<Book> booksByYear(int year) {
        List<Book> booksByYearList = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublicationYear() > year) {
                booksByYearList.add(book);
            }
        }
        return booksByYearList;
    }
}

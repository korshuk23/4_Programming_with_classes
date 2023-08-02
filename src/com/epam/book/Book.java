package com.epam.book;

import java.util.List;

public class Book {
    private int id;
    private static int ID;
    private String bookName;
    private List<String> authors;
    private PublishingType publisher;
    private int publicationYear;
    private int pageNumbers;
    private int price;
    private BindingType bindingType;

    public Book(String bookName, List<String> authors, PublishingType publisher,
                int publicationYear, int pageNumbers, int price, BindingType bindingType) {
        this.id = ++ID;
        this.bookName = bookName;
        this.authors = authors;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.pageNumbers = pageNumbers;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public PublishingType getPublisher() {
        return publisher;
    }

    public void setPublisher(PublishingType publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BindingType getBindingType() {
        return bindingType;
    }

    public void setBindingType(BindingType bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", bookName: " + bookName +
                ", authors: " + authors +
                ", publisher: " + publisher +
                ", publicationYear: " + publicationYear +
                ", pageNumbers: " + pageNumbers +
                ", price: " + price +
                ", bindingType: " + bindingType + "\n";
    }
}

package com.epam.book;

import java.util.ArrayList;
import java.util.List;

/*
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод  toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *    Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 *    Найти и вывести:
 *    a) список книг заданного автора;
 *    b) список книг, выпущенных заданным издательством;
 *    c) список книг, выпущенных после заданного года.
 */
public class BookRunner {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book( "Java", List.of("Sergei", "Egor", "Nikita"), PublishingType.GRAND_FAIR,
                2012, 560, 15, BindingType.SOFT));
        books.add(new Book( "Python", List.of("Ivan", "Egor", "Nikita"), PublishingType.ONYX,
                2016, 160, 16, BindingType.SOFT));
        books.add(new Book( "Golang", List.of("Andrei", "Egor", "Nikita"), PublishingType.AST,
                2012, 350, 22, BindingType.SOFT));
        books.add(new Book( "JavaScript", List.of("Alexandr", "Egor", "Nikita"), PublishingType.PITER,
                2017, 860, 13, BindingType.SOFT));
        BookService service = new BookService(books);
        //taskA
        System.out.println(service.booksByAuthor("Alexandr"));
        //taskB
        System.out.println(service.booksByPublishHouse("Ast"));
        //taskC
        System.out.println(service.booksByYear(2016));
    }

}

package com.epam.customer;

import java.util.ArrayList;
import java.util.List;

/*
 * Создать класс Customer, спецификация которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод  toString(). Создать второй класс,
 * агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *
 *    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки,
 *    номер банковского счета.
 *    Найти и вывести:
 *    a) список покупателей в алфавитном порядке;
 *    b) список покупателей, у которых номер кредитной карточки находится
 *    в заданном интервале.
 */
public class CustomerRunner {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Frolov", "Sergei", "Ivanovich", "Minsk",
                123456789L, 1234));
        customers.add(new Customer("Sidorov", "Nikita", "Egorovich", "Slytsk",
                456789101L, 4567));
        customers.add(new Customer("Leonov", "Denis", "Sergeevich", "Kopyl",
                567891011L, 5678));
        customers.add(new Customer("Rebrov", "Vasiliy", "Igorevich", "Grodno",
                678910111L, 6789));
        customers.add(new Customer("Brodko", "Egor", "Konstantinovich", "Nesvizh",
                789101112L, 7891));

        CustomerService service = new CustomerService(customers);

        System.out.println(service.customerListByAlphabet());
        System.out.println("---------------------------------");
        System.out.println(service.customerByCreditCardNumber(123456789L, 761011121L));
    }
}

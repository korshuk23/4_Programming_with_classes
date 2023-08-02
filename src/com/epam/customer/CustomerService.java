package com.epam.customer;

import java.util.*;

public class CustomerService {
    private final List<Customer> customers;

    public CustomerService(List<Customer> customers) {
        this.customers = new ArrayList<>(customers);
    }

    public List<Customer> customerListByAlphabet() {
        List<Customer> customersByAlphabet = new ArrayList<>(customers);
        Comparator<Customer> nameComparator = Comparator.comparing(Customer::getSurname)
                .thenComparing(Customer::getName)
                .thenComparing(Customer::getPatronymic);
        customersByAlphabet.sort(nameComparator);
        return customersByAlphabet;
    }

    public List<Customer> customerByCreditCardNumber(long from, long to) {
        List<Customer> customersByCreditCard = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber() > from && customer.getCreditCardNumber() < to) {
                customersByCreditCard.add(customer);
            }
        }
        return customersByCreditCard;
    }
}

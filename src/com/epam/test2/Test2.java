package com.epam.test2;

/*
 *  Создйте  класс  Test2 c  двумя  переменными.  Добавьте  конструктор  с  входными  параметрами.  Добавьте
 *  конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
 *  класса.
 */
public class Test2 {
    private int first;
    private int second;

    public Test2(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public Test2() {
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}

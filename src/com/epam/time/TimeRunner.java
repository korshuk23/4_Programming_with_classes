package com.epam.time;

/*
 * Составьте  описание  класса  для  представления  времени.
 * Предусмотрте  возможности установки  времени  и изменения его отдельных полей (час, минута, секунда)
 * с проверкой допустимости вводимых значений. В случае недопустимых  значений полей  поле
 * устанавливается  в  значение  0.  Создать  методы  изменения  времени на заданное количество
 * часов, минут и секунд.
 */
public class TimeRunner {
    public static void main(String[] args) {
        Time localTime = new Time("10:10:10");
        System.out.println(localTime.getTime());
        localTime.setHours(-1);
        System.out.println(localTime.getTime());
        System.out.println(localTime.plusMinutes(2));
        System.out.println(localTime.plusHours(2));
    }
}

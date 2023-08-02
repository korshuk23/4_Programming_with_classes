package com.epam.student;

import java.util.ArrayList;
import java.util.List;

/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class StudentRunner {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Miller N.A.", "1", new double[]{9, 9, 10, 9, 10}));
        students.add(new Student("Boris C.N.", "1", new double[]{8, 9, 10, 9, 10}));
        students.add(new Student("Soltis V.A.", "3", new double[]{9, 6, 10, 9, 10}));
        students.add(new Student("Mollis A.V.", "2", new double[]{9, 9, 10, 9, 10}));
        students.add(new Student("Nikson A.A.", "1", new double[]{9, 9, 9, 9, 10}));
        students.add(new Student("Berdis V.V.", "3", new double[]{9, 8, 10, 9, 10}));
        students.add(new Student("Konis A.A.", "2", new double[]{9, 9, 10, 9, 10}));
        students.add(new Student("Janilov K.A.", "2", new double[]{9, 7, 10, 9, 10}));
        students.add(new Student("Horix F.V.", "1", new double[]{9, 9, 9, 9, 10}));
        students.add(new Student("Werdex N.N.", "3", new double[]{10, 10, 10, 9, 10}));
        students.add(new Student("Kolas F.V.", "1", new double[]{10, 9, 10, 9, 10}));

        StudentService.topStudent(students);
    }
}

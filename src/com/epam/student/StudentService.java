package com.epam.student;

import java.util.Arrays;
import java.util.List;

public class StudentService {
    public static void topStudent(List<Student> students) {
        students.stream()
                .filter(student -> Arrays.stream(student.getAcademicPerformance()).allMatch(s -> s >= 9))
                .forEach(System.out::println);
    }
}

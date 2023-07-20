package com.epam.student;

public class Student {
    private String FIO;
    private String groupNumber;
    private double[] academicPerformance = new double[5];

    public Student(String FIO, String groupNumber) {
        this.FIO = FIO;
        this.groupNumber = groupNumber;
    }

    public Student(String FIO, String groupNumber, double[] marks) {
        this.FIO = FIO;
        this.groupNumber = groupNumber;
        this.academicPerformance = marks;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public double[] getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(double[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    @Override
    public String toString() {
        return "FIO='" + FIO + '\'' +
                ", groupNumber='" + groupNumber;
    }
}

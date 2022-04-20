package ru.jotoo.Lesson5.ArrayList;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hureDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hureDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHureDay() {
        return hureDay;
    }

    public void raiseSalary(double byPersent) {
        double raise = salary * byPersent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hureDay=" + hureDay +
                '}';
    }
}

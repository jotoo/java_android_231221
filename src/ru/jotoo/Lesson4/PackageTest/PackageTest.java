package ru.jotoo.Lesson4.PackageTest;

import static java.lang.System.*;

public class PackageTest {
    public static void main(String[] args) {
        Employee[] harry = new Employee[2];
        harry[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        harry[1] = new Employee("Harry Hacker2", 50001, 1990, 10, 1);

        for (Employee e : harry)
            e.raiseSalary(5);

        //harry.raiseSalary(5);
        for (Employee e : harry)
            out.println("name = " + e.getName() + ", salary = " + e.getSalary() + ", hireday = " + e.getHireDay());
    }
}

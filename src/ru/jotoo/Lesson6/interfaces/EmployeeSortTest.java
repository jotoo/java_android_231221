package ru.jotoo.Lesson6.interfaces;

import java.util.Arrays;

/**
 * В данной программе демонстрируется применение интерфейса Comparable
 */
public class EmployeeSortTest
{
    public static void main(String[] args)
    {

        Employee[] staff = new Employee[]
                                         {
                                          new Employee("Harry Hacker", 35000),
                                          new Employee("Carl Cracker", 75000),
                                          new Employee("Tony Tester", 38000)
                                         };

        Arrays.sort(staff);

        for (Employee e:staff)
        {
            System.out.println("name="+ e.getName() + ",salary="+ e.getSalary());
        }
    }
}

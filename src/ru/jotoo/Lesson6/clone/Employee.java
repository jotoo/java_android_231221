package ru.jotoo.Lesson6.clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException {
        //вызвать метод Object.clone()
        Employee cloned = (Employee) super.clone();

        //клонировать измененяемые поля
        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }

    /**
     * Устанавливает заданную дату приёма на работу
     *
     * @param year  Год приёма на работу
     * @param month Месец приёма на работу
     * @param day   День приёма на работу
     */

    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();

        //пример изменения поля экземпляра
        hireDay.setTime(newHireDay.getTime());
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
                ", hireDay=" + hireDay +
                '}';
    }
}

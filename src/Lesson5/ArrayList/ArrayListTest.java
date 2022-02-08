package Lesson5.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Employee> staff = new ArrayList<Employee>(10);

        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));
        //staff.ensureCapacity(10);
        staff.trimToSize();
        staff.set(2, new Employee("Tester Tony", 44000, 1991, 4, 16));
        for (Employee e : staff)
            e.raiseSalary(5);
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHureDay());
        System.out.println(staff.size());
        //System.out.println(Arrays.toString(new Employee[]{staff.get(0)}));
        System.out.println(staff.get(0));
        staff.remove(1);
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHureDay());


    }
}

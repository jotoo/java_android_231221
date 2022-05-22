package ru.jotoo.Lesson5.Hw5;

public class Main {
    public static void main(String[] args) {

        Employeehw5[] arr = new Employeehw5[5];
        arr[0] = new Employeehw5("Вася", "Рабочий");
        arr[1] = new Employeehw5("Валера", "Рабочий");
        arr[2] = new Employeehw5("Веталя", "Рабочий");
        arr[3] = new Employeehw5("Вова", "Рабочий");
        arr[4] = new Employeehw5("Ваня", "Менеджер", "123@mail.com", 123321, 80000.00, 41);

        Employeehw5[] arr2 = {new Employeehw5("Вася", "Рабочий"),
                new Employeehw5("Веталя", "Рабочий"),
                new Employeehw5("Вася", "Рабочий"),
                new Employeehw5("Ваня", "Рабочий"),
                new Employeehw5("Вова", "Менеджер"),
        };

        for (Employeehw5 e : arr) {
            if (e.getAge() > 40)
                e.info();
        }

        for (Employeehw5 e : arr2) {
            e.info();
        }

    }
}

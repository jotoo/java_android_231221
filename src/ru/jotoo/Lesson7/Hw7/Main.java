package ru.jotoo.Lesson7.Hw7;

public class Main {
    public static void main(String[] args) {

        Cat[] arr = {
                new Cat("Пушок", 10),
                new Cat("Чушка", 9),
                new Cat("Мурзкик", 8),
                new Cat("Сёма", 7),
                new Cat("Топчик", 6),
                new Cat("Барсик", 5),
                new Cat("Вася", 4)
        };

        Plate plate = new Plate(48);

        for (Cat c : arr) {
            c.eat(plate);
        }

        plate.info();
        plate.add(100);
        plate.info();
    }
}

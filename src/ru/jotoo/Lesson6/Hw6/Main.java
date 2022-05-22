package ru.jotoo.Lesson6.Hw6;

public class Main {
    public static void main(String[] args) {

        Animal[] arr = {
                new Cat("Барсик"),
                new Cat("Васька"),
                new Dog("Шарик"),
                new Dog("Туман"),
                new Dog("Шайтан")
        };

        // for (Animal a : arr) {
        //     a.run(200);
        //     a.sail(9);
        // }

        for (int i = 0; i < arr.length; i++) {
            arr[i].sail(8);
            arr[i].run(199);
        }
        System.out.println("Всего животных " + arr.length);
        System.out.println("Всего животных " + Animal.count);

        Animal cat1 = new Cat("Чумка");
        if (cat1 instanceof Cat) {
            ((Cat) cat1).run(100);
        }
    }
}


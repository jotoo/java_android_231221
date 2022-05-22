package ru.jotoo.Lesson7.Hw7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }


    public void eat(Plate p) {

        while (!satiety) {
            boolean flag = p.decreaseFood(appetite);

            if (!flag) {
                System.out.println("Кот " + name + " не поел");
                break;
            }
            if (flag) {
                System.out.println("Кот " + name + " поел");
                satiety = true;
                break;
            }
        }
        if (satiety) {
            System.out.println("Кот " + name + " сытый");

        }

        System.out.println("Сытость = " + satiety);

    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

}

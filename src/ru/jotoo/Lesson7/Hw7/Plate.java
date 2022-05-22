package ru.jotoo.Lesson7.Hw7;

public class Plate {

    private int food;


    public Plate(int food) {
        if (food <= 0)
            System.out.println("Введите положительное число!");
        else
            this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }


    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            return true;
        } else
            System.out.println("В тарелке недостаточно еды!");
        return false;
    }

    public void add(int n) {
        if (n >= 0)
            food += n;
        else
            System.out.println("Введите положительное число!");

    }

}


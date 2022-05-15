package ru.jotoo.Lesson6.Hw6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sail(int length) {
        System.out.println(name + " не умеет плавать!");
    }

    @Override
    public void run(int length) {
        if (length <= 200 && length >= 0) {
            System.out.println(name + " пробежал " + length + " метров.");
        } else
            System.out.println(name + " не пробежит столько.");
    }
}

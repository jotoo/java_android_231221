package ru.jotoo.Lesson6.Hw6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sail(int length) {
        if (length <= 10 && length >= 0) {
            System.out.println(name + " проплыл " + length + " метров.");
        } else
            System.out.println(name + " не проплывёт столько.");
    }

    @Override
    public void run(int length) {
        if (length <= 500 && length >= 0) {
            System.out.println(name + " пробежал " + length + " метров.");
        } else
            System.out.println(name + " не пробежит столько.");
    }
}

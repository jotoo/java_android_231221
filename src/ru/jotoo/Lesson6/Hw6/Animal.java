package ru.jotoo.Lesson6.Hw6;

public abstract class Animal {

    public String name;
    public static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public abstract void sail(int length);

    public abstract void run(int length);

}

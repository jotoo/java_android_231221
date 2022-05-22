package ru.jotoo.Lesson5.Hw5;

public class Employeehw5 {

    private String name;
    private String post;
    private String email;
    private int telefon;
    private double salary;
    private int age;

    public Employeehw5(String name, String post, String email, int telefon, double salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.telefon = telefon;
        this.salary = salary;
        this.age = age;
    }

    public Employeehw5(String name, String post) {
        this.name = name;
        this.post = post;
        this.email = "Нет";
        this.telefon = 0;
        this.salary = 0;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println("name: " + this.name + "; " + "post: " + this.post + "; " + "email: " + this.email + "; "
                + "telefon: " + this.telefon + "; " + "salary: " + this.salary + "; " + "age: " + this.age + "; ");
    }
}

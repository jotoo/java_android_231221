package ru.jotoo.Lesson1;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // Проверка./**/
        /*final int a = 20;
        float b;
        b = 2.25f;
        String c = "Test";
        char d = 1;
        double f = 4.44444;
        byte g = 100;*/


        /*float radius = 2.0f , height = 10.0f;
        float valume = 3.1416f * radius * radius * height;
        System.out.printf("Обьём цилиндра равен " + "%8.3f",valume);*/


        //int a = 10, b = 20, c = (a + b - 5) * 2;
        //System.out.println("c =" + c);
        /*int a, b;
        a = 128;
        System.out.println("a = " + a);
        b = a / 2;
        System.out.println("b = a/2 = " + b);*/
        /*System.out.println(summ(5,5));
        printSomeText();
        printMyText("Opa");*/


       /* int a = 2, b = 3, c = 0;
        if (a < b) {
            System.out.println("a меньше b");
        }
        if (a == b) {
            System.out.println("a равно b"); //небудет выведено!
        }
        if (c >= 0) {
            System.out.println("c не отрицательно");
        }
        c = a - b;
        System.out.println("c= " + c);
        if (c < 0)
        {
            System.out.println("c отрицательно");
        }*/
        System.out.println(opa(1, 2, 3, 4));
        System.out.println(opa2(summ(5, 6)));
        nom(-1);
        nom(1);
        System.out.println(opa3(-1));
        System.out.println(opa3(1));
        name("Жота");
        printyear(8);
        printyear(300);
        printyear(800);


    }


    public static float opa(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean opa2(int summ) {
        if (summ >= 10 && summ <= 20) {
            return true;
        } else
            return false;
    }

    public static int summ(int a, int b) {
        return a + b;

    }

    public static void printSomeText() {
        System.out.println("Hello!");

    }

    public static void printMyText(String txtToPrint) {
        System.out.println(txtToPrint);

    }

    public static void nom(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else if (a < 0) {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean opa3(int a) {
        if (a >= 0) {
            return true;
        } else return false;
    }

    public static void name(String a) {
        System.out.println("Привет " + a + "!");
    }


    public static boolean year(int a) {
        return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;
    }

    public static void printyear(int a) {
        System.out.printf("%d год %sявляется високосным!\n", a, year(a) ? " " : "Не ");

    }

}

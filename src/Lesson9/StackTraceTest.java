package Lesson9;

import java.util.Scanner;

/**
 * В этой программе выводиться трасировка стека вызовов рекурсивного метода
 */


public class StackTraceTest {

    public static void main(String[] args) {
        try (var in = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = in.nextInt();
            factorial(n);
        }

    }

    /**
     * Вычесляет факториал заданного числа
     *
     * @param n Положительное целое число
     * @return n! = 1 * 2 * . . . * n
     */
    public static int factorial(int n) {
        System.out.println("factorial(" + n + "):");
        var walker = StackWalker.getInstance();
        walker.forEach(System.out::println);
        int r;
        if (n <= 1) r = 1;
        else r = n * factorial(n - 1);
        System.out.println("return " + r);
        return r;
    }
}

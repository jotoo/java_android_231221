package ru.jotoo.Lesson5.methods;

import java.lang.reflect.Method;

/**
 * В этой программе демонстрируется применение рефлексии для вызова методов
 */
public class MethodTableTest {
    public static void main(String[] args) throws ReflectiveOperationException {
        //получить указатели на методы square() и sqrt()
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        //вывести значения x и y  в табличном виде
        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);


    }

    /**
     * Возвращает квадрат числа
     *
     * @param x число
     * @param x квадрат числа
     */
    public static double square(double x) {
        return x * x;
    }

    /**
     * Выводит в табличном виде значения x и y указанного метода
     *
     * @param from Нижнаяя граница x
     * @param to   Верхняя граница x
     * @param n    Кол-во строк в таблице
     * @param m    Метод, получающий и возвращающий значение double
     */
    public static void printTable(double from, double to, int n, Method m) throws ReflectiveOperationException {
        //Вывести сигнатуру метода в заголовке таблицы
        System.out.println(m);

        double dx = (to - from) / (n - 1);
        for (double x = from; x <= to; x += dx) {
            double y = (Double) m.invoke(null, x);
            System.out.printf("%10.4f | %10.4f%n", x, y);
        }
    }
}

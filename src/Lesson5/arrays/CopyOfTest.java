package Lesson5.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * В этой программе демонстрируется рефлексия для манипулирования массивами.
 */
public class CopyOfTest {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom", "Dick", "Harry"};
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception.");
        b = (String[]) badCopyOf(b, 10);

    }

    /**
     * В этом методе  предпринимается попытка нарастить массив
     * путём выделения нового массива и копирования в него
     * всех прежних эелементов.
     *
     * @param a         Наращиваемый массив
     * @param newLength Новая длинна массива
     * @return Возвращаемый наращиваемый массив, содержащий все элементы
     * массива a, но он относиться к типу Object[], а не к типу a
     */

    public static Object[] badCopyOf(Object[] a, int newLength) // Не сработает
    {
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    /**
     * Этот метод наращивает массив, выделяя новый массив того же типа
     * и копируя в него все прежние элементы.
     *
     * @param a Наращиваемый массив может быть массивом обьектов или же
     *          массивом примитивных типов
     * @return Возвращаемый наращенный массив, содержащий все элементы массива a
     */

    public static Object goodCopyOf(Object a, int newLenght) {
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        Class coponentType = cl.getComponentType();
        int Length = Array.getLength(a);
        Object newArray = Array.newInstance(coponentType, newLenght);
        System.arraycopy(a, 0, newArray, 0, Math.min(Length, newLenght));
        return newArray;
    }

}

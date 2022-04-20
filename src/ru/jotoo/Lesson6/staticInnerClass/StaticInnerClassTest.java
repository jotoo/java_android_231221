package ru.jotoo.Lesson6.staticInnerClass;

/**
 * В этой программе демонстрируется применение статического внутреннего класса
 */

public class StaticInnerClassTest {
    public static void main(String[] args) {

        double[] values = new double[20];
        for (int i = 0; i < values.length; i++) {
            values[i] = 100 * Math.random();
        }
        ArrayAlg.Pair p = ArrayAlg.minmax(values);
        System.out.printf("min = %3.6f\n", p.getFirst());
        System.out.printf("max = %3.6f\n", p.getSecond());

    }
}

class ArrayAlg {
    /**
     * Пара чисел с плавающей точкой
     */
    public static class Pair {
        private double first;
        private double second;

        /**
         * Составляет пару из двух чисел с плавабщей точкой
         *
         * @param f первое число
         * @param s второе число
         */

        public Pair(double f, double s) {
            first = f;
            second = s;
        }

        /**
         * Возвращает первое число из пары
         *
         * @return Возврат первого числа
         */
        public double getFirst() {
            return first;
        }

        /**
         * Возвращает второе число из пары
         *
         * @return Возврат второго числа
         */
        public double getSecond() {
            return second;
        }
    }

    /**
     * Определяет максимальное и минимальное числа в массиве
     *
     * @param values чисел с плавающей точкой
     * @return Пара, первым элементом которой является минимальное число, а вторым элементом - максимальное число
     */

    public static Pair minmax(double[] values) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            if (min > v) min = v;
            if (max < v) max = v;
        }
        return new Pair(min, max);
    }


}
package Lesson6.proxy;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * В этой программе демонстрируется использование прокси-обьектов
 */
public class ProxyTest {
    public static void main(String[] args) {
        var elements = new Object[1000];
        //заполнить массив elements прокси-обьектами целых чисел 1-1000
        for (int i = 0; i < elements.length; i++) {
            Integer value = i + 1;
            var handler = new TraceHandler(value);
            Object proxy = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Comparable.class}, handler);
            elements[i] = proxy;
        }
        //сформировать случайное число
        Integer key = (int) (Math.random() * elements.length) + 1;

        //выполнить поиск по критерию key
        int result = Arrays.binarySearch(elements, key);

        //вывести совпавший элемент, если таковой найден
        if (result >= 0) System.out.println(elements[result]);
    }
}

/**
 * Оброботчик вызовов, выводящий сначало имя метода и его параметры,
 * а затем вызывающий исходный метод
 */

class TraceHandler implements InvocationHandler {
    private Object target;

    public TraceHandler(Object t) {
        this.target = t;
    }

    @Override
    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        //вывести неявный аргумент
        System.out.print(target);
        //вывести название метода
        System.out.print("." + m.getName() + "(");
        //вывести явные аргументы
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) System.out.print(", ");
            }
        }
        System.out.println(")");
        //вызвать конкретный метод
        return m.invoke(target, args);
    }
}

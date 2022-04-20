package ru.jotoo.Lesson5.objectAnalyzer;

import java.util.ArrayList;

/**
 * Эта программа использует рефлексию для слежения за обьектами.
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) throws ReflectiveOperationException {
        var squares = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            squares.add(i * i);
            System.out.println(new ObjectAnalyzer().toString(squares));
        }
    }
}

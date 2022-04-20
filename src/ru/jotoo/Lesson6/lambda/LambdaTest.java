package ru.jotoo.Lesson6.lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * В этой программе демонстрируется использование лямбда-выражений
 */
public class LambdaTest {

    public static void main(String[] args) {

        var planets = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        //Arrays.sort(planets);
        //System.out.println(Arrays.toString(planets));
        //System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println("Sorted by length:");
        System.out.println(Arrays.toString(planets));

        var t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }
}

package ru.jotoo.Lesson6.timer;

import javax.swing.*;
import java.time.*;
import java.awt.*;
import java.awt.event.*;

public class TimerTest {
    public static void main(String[] args) {
        TimePrinter listener = new TimePrinter();

        //построить таймер, вызывающий приёмник событий каждую секунду
        Timer timer = new Timer(1000, listener);

        //продолжить выполнение программы до тех пор, пока пользователь не выберет экранную кнопку "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }

    static class TimePrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
            Toolkit.getDefaultToolkit().beep();

        }
    }

}

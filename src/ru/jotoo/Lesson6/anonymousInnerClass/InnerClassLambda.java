package ru.jotoo.Lesson6.anonymousInnerClass;


import javax.swing.*;
import java.awt.*;
import java.time.Instant;

/**
 * В этой программе демонстрируется применение анонимных внутренних классов
 */
public class InnerClassLambda {
    public static void main(String[] args) {
        var clock = new TalkingClocklambda();
        clock.start(1000, true);

        //выполнять программу до тех пор, пока пользователь не нажмёт кнопку "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

/**
 * Часы выводящие время через определённые промежутки
 */
class TalkingClocklambda {
    /**
     * Запускает часы.
     *
     * @param interval Интервал между сообщениями в миллисекундах
     * @param beep     если истенно, то часы издают звуковой сигнал
     */
    public void start(int interval, boolean beep) {
        var timer = new Timer(interval, event -> {
            System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
            if (beep) Toolkit.getDefaultToolkit().beep();
        });
        timer.start();
    }
}
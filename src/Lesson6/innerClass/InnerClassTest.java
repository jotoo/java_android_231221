package Lesson6.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * В этой программе демонстрируется работа внутреннего класса
 */
public class InnerClassTest {
    public static void main(String[] args) {

        var clock = new TalkingClock(1000, true);
        clock.start();

        //выполнять программу до тех пор,пока пользователь не щелкнет на экранной кнопке "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }
}

/**
 * Часы выводящие время через регулярные промежутки
 */

class TalkingClock {
    private int interval;
    private boolean beep;

    /**
     * Конструирует "говорящие  часы"
     * @param interval Интервал между сообщениями в миллисекундах
     * @param beep     Истинно, если часы должны издавать звуковой сигнал
     */
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    /**
     * Запустить часы
     */
    public void start() {
        TimePrinter listener = new TimePrinter();
        var timer = new Timer(interval, listener);
        timer.start();
    }

    public class TimePrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
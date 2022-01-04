package Lesson3;

import java.util.Scanner;
import java.util.Random;

public class Hw3 {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        //System.out.println(rand());
        guessTheNumber();

    }

    public static int rand() {
        int x = random.nextInt(10);
        return x;
    }

    public static void guessTheNumber() {
        int x = rand();
        int k = 3;
        System.out.println("Угайдайте число от 0 до 9. У вас 3 попытки.");
        for (int i = 0; i != k; k--) {
            int a = sc.nextInt();
            if (a == x) {
                System.out.println("Вы угадали!");
                if (playingMore()) {
                    guessTheNumber();
                } else return;
            } else if (a > x) {
                System.out.println("Попробуйте число меньше!");
            } else if (a < x) {
                System.out.println("Попробуйте число больше!");
            }
            System.out.println("У вас осталось " + (k - 1) + " попыток!");
        }
        if (k == 0) {
            if (playingMore()) {
                guessTheNumber();
            }
        }
    }

    public static boolean playingMore() {
        System.out.println("Хотите сыграть ещё? Введите yes/no ");
        String a = sc.next();
        return a.equals("yes");
    }


}





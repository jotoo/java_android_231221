package ru.jotoo.Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Hw3_1 {
    public static Random random = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //game();
        guessWord();


    }

    public static void game() {
        int k;
        int max = 10;
        do {
            int b = random.nextInt(max);
            boolean guess = false;
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число от 0 до " + (max - 1));
                System.out.println("Попытки " + (3 - i));
                int a = sc.nextInt();
                if (a > b) {
                    System.out.println("Попробуйте меньше!");
                }
                if (a < b) {
                    System.out.println("Попробуйте больше!");
                }
                if (a == b) {
                    guess = true;
                    break;
                }

            }
            if (guess) {
                System.out.println("Вы выиграли! Число было " + b);
            } else {
                System.out.println("Вы поиграли! Число было " + b);
            }
            System.out.println("Повторить 1 - да ");
            k = sc.nextInt();
        } while (k == 1);
        System.out.println("Досвидания!");

    }


    public static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int b = random.nextInt(words.length);
        System.out.println("Cлово " + words[b]);


        while (true) {
            System.out.println("Введите слово! ");
            String a = sc.nextLine();

            if (a.equals(words[b])) {
                System.out.println("Вы угодали!");
                break;
            } else {
                for (int i = 0; i < 15; i++) {
                    if (i < words[b].length() && i < a.length() && words[b].charAt(i) == a.charAt(i)) {
                        System.out.print(a.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
            }
        }
        System.out.println("Вы угодали! Слово было " + words[b]);
    }


}

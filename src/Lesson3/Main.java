package Lesson3;

import java.util.Scanner;
import java.util.Random;


public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        /*int a = sc.nextInt();
        String b = sc.nextLine();
        String c = sc.next();
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        a *= 2;
        System.out.println("Введённое вами число умножено на 2 и равно: " + a);
        //sc.close();*/
        //int d = getNumberFromScanner("Введите число от 5 до 10 : ", 5, 10);
        // System.out.println("d= " + d);
        //int[][] arr2d = {{5, 6, 7, 8, 9}, {1, 2, 3, 4, 5}};
        //print2DArray(arr2d);
        //int [][] arr2d2 = new int[5][5];
        //print2DArray(arr2d2);
        int[] arr = {1, 22, 33, 2, 44, 55};
        //System.out.println(arrSumm(arr));
        int x = random.nextInt(100) - 50;
        //System.out.println(x);
        //System.out.printf("Слово: %s, Число с плавующей запятой %5.5f, Целое число %d, Символ: %c", "Java", 3.14f, 13, 'e');
        String str1 = "A";
        String str2 = "A";
        String str3 = "B";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

    }

    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i <= arr[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int arrSumm(int[] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        return summ;
    }

}

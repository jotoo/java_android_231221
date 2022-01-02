package Lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int a = 2;
        switch (a) {
            case 1:
                System.out.println("a = 1");
                break;
            case 3:
                System.out.println("a = 3");
                break;
            default:
                System.out.println("Ни один case не сработал");

        }*/
        /*for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);

        }
        System.out.println("End");
    }*/
        /*int x;
        for (x = 10; x >= 0; x -= 5) {
            System.out.print(x + " ");

        }


        int a = 0;
        for (int count = 10; count < 5; count++) { // Не выполниться, потому что 10 > 5.
            a += count;

        }
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i-j: " + i + "-" + j);

        }
        for (int i = 0; i < 10; i++) {
            if (i > 3)
            {
                break;
            }
            System.out.println("i = " + i);


        }*/

        /*String [] sm = {"A","B","C","D"};
        for (String o: sm)
        {
            System.out.print(o + " ");
        }

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(" " + i + j);
            }

        }*/

        /*int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);

        }*/

        //System.out.print(Arrays.toString(arr));

        /*int[] arr2 = new int[4];
        arr2[0] = 5;
        arr2[1] = 7;
        arr2[2] = 8;
        arr2[3] = 3;*/

        //int [] arr2 = {6,3,2,3,4,5,6,7,};
        //System.out.println(Arrays.toString(arr2));


        //int [][] arr = new int [10][20];
        /*int counter = 1;
        int[][] table = new int[3][4];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = counter;
                System.out.printf("%4d", table[i][j]);
                counter++;

            }
            System.out.println();
        }*/
        /*int[][] arr = {
                {5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5, 6},
                {3, 2, 12, 21, 18}
        };
        printArr(arr);
        int[] arr2 = {5,6,7,8,9,0,1,12};
        System.out.println("arr2.length: " + arr2.length);
        for (int i = 0; i < arr2.length ; i++) {
            System.out.print(arr2[i]+" ");

        }*/
        //Домашнее задание.
        int[] arr01 = {0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1};//1
        System.out.println(Arrays.toString(arr01));
        for (int i = 0; i < arr01.length; i++) {
            if (arr01[i] == 0) {
                arr01[i] = 1;
            } else {
                arr01[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr01));//1

        int[] arr02 = new int[8];//2
        int c = 0;
        for (int i = 0; i < arr02.length; i++) {
            arr02[i] = c;
            c += 3;
        }
        System.out.println(Arrays.toString(arr02));//2

        int[] arr03 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};//3
        System.out.println(Arrays.toString(arr03));
        for (int i = 0; i < arr03.length; i++) {
            if (arr03[i] < 6) {
                arr03[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr03));//3

        int[][] arr04 = new int[5][5];//4

        for (int i = 0; i < arr04.length; i++) {
            for (int j = 0; j < arr04[i].length; j++) {
                if (i == j || i + j == arr04.length - 1) {
                    arr04[i][j] = 1;
                }
                System.out.print(arr04[i][j] + " ");
            }
            System.out.println();
        }//4
        //System.out.println(Arrays.toString(arr04));


        System.out.println(maxValue(arr03));
        System.out.println(minValue(arr03));
        int [] arr05 = {1,2,3,4,5,5,4,3,2,1};
        System.out.println(checkBalance(arr05));

    }


    /*public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ ",");
            }
            System.out.println();
        }
    }*/
    //Домашнее задание.

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static boolean checkBalance(int[] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];

        }
        if (summ % 2 != 0) {
            return false;
        }
        int sumLeft = 0;
        int i = 0;
        while (sumLeft < summ/2){
            sumLeft += arr[i];
            i++;
        }
        return sumLeft == summ/2;
    }

}

package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void matrix12(int n, int m) {
        int[][] arr = new int[n][m];
        int q = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < m; i++) {
                if (true) {
                    arr[i][j] = count;
                    count++;

                }
            }
        }
    }

    public static void multiplicationTable() {
        int[][] arr = new int[4][5];
        int col = 0;
        int row = 0;
        for (int i = 0; i < 4*5; i++) {
//            arr[i][i]=i*i;
            row = i/4;
            col = i%4;
            if(col%4 == 0){
                System.out.print("\n");
            }
            System.out.print(row*col+" ");



        }
    }

    public static void primeFactors(int n) {
        while (n%2==0){
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+= 2){
            while (n%i == 0){
                System.out.print(i + " ");
                n /= i;
            }
        }


        if (n > 2)
            System.out.print(n);

    }


    /**
     * Geometric Progression
     *
     * @param n
     * @param b1
     * @param q
     */
    public static void geometricProgression(int n, float b1, float q) {

        for (int i = 1; i <= n; i++) {
            b1 = b1 * q;
        }
        System.out.printf("%.2f", b1);

    }

    /**
     * Checkerboard
     *
     * @param n
     */
    public static void checkerboard(int n) {
        String[][] arr = new String[n][n];

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        arr[i][j] = "O";
                    } else {
                        arr[i][j] = "X";
                    }
                }
                if (i % 2 == 1) {
                    if (j % 2 == 0) {
                        arr[i][j] = "X";
                    } else {
                        arr[i][j] = "O";
                    }

                }
                System.out.print(arr[i][j]);
                if (j == n - 1) {
                    System.out.print("\n");
                }


            }
        }

    }


    /**
     * Three letters
     */
    public static void threeLetter() {
        StringBuilder s = new StringBuilder("asq");
        char r = s.charAt(0);
        s.delete(0, 1);
        String s1 = s.toString();
        s1 = s1.toLowerCase();
        char r1 = Character.toUpperCase(r);
        System.out.println(r1 + s1);


    }

    /**
     * palindrome
     *
     * @param a
     * @param b
     */
    public static void palindrome(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i / 1000 == i % 10 && (i / 100 - 10 * i / 1000) == ((i % 100 - i % 10) / 10)) {
                System.out.println(i);
            }
        }
    }

    /**
     * Number prime
     *
     * @param n
     */
    public static void primeNumber(int n) {
        if (n == 2) {
            System.out.println("is prime");
        }
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                System.out.println("is not prime");
                break;
            } else {
                System.out.println("is prime");
                break;
            }
        }


    }

    public static void countLoop() {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 2; i <= 15; i++) {
            count1++;
        }
        for (int i = 10; i <= 100; i = i + 7) {
            count2++;
        }
        for (float i = 1.5f; i <= 10.3; i = i + 0.4f) {
            count3++;
        }
        System.out.println("Loop 1: " + count1);
        System.out.println("Loop 2: " + count2);
        System.out.println("Loop 3: " + count3);
    }

    /**
     * Hours and minutes
     *
     * @param n
     */
    public static void hoursMinutes(int n) {
        int hours = 0;
        int minutes = 0;
        hours = n / 60;
        minutes = n % 60;
        while (hours > 23) {
            hours -= 24;
        }


        System.out.println(hours + " " + minutes);


    }

    /**
     * Task 01.A natural number N is given (entered from the keyboard). Calculate two to the power of N
     * Display the calculated value (1 <= N <= 15).
     *
     * @param n
     */
    public static void calculateTwoPower(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a *= 2;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
//        if (n >= 1 && n <= 15) {
//            calculateTwoPower(n);
//        }
//        hoursMinutes(n);

//        countLoop();

//        primeNumber(n);
//        System.out.print("Enter A: ");
//        int a = sc.nextInt();
//        System.out.print("Enter B: ");
//        int b = sc.nextInt();
//        palindrome(a,b);


//        threeLetter();

//        checkerboard(n);

//        System.out.print("Enter b1: ");
//        float b1 = sc.nextFloat();
//        System.out.print("Enter q: ");
//        float q =sc.nextFloat();
//        geometricProgression(n,b1,q);

//        primeFactors(n);

        int m = sc.nextInt();
        multiplicationTable();

//        System.out.print("Enter m: ");
//        int m = sc.nextInt();
//        matrix12(n, m);

    }
}

package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean primeNumberCheck(int num) {
        for (int i = 2; i <= (num / 2); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter first number : ");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        System.out.println("Enter last number : ");
        int lastNumber = sc.nextInt();
        for (int num = firstNumber; num <= lastNumber; num++) {
            if (primeNumberCheck(num)) {
                System.out.println(num);
            }
        }
    }

}

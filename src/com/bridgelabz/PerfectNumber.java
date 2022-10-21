package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static int perfectNumberCheck(int num) {
        int sum = 0;
        for (int i = 1; i <= (num / 2); i++) {
            if (num % i == 0) {		//num = 28

                sum = sum + i;	// 1	3	7	14 	28
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        sum = perfectNumberCheck(num);
        if (sum == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }

}

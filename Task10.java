package Upload;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int lastDigitA = Math.abs(a % 10);
        int lastDigitB = Math.abs(b % 10);

        int sum = lastDigitA + lastDigitB;

        System.out.println("Sum of last digits = " + sum);

        sc.close();
    }
}
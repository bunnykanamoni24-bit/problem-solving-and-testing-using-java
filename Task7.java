package Upload;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int evenSum = 0, oddSum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;

            num /= 10;
        }

        System.out.println("Even Digit Sum = " + evenSum);
        System.out.println("Odd Digit Sum = " + oddSum);
    }
}

package Upload;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        if (n <= 0) {
            System.out.println("Invalid input");
        } else if (n == 1) {
            System.out.println("Fibonacci number = " + a);
        } else if (n == 2) {
            System.out.println("Fibonacci number = " + b);
        } else {
            int c = 0;

            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println("Fibonacci number = " + c);
        }

        sc.close();
    }
}

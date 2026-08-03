package Upload;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of elements");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K value: ");
        int k = sc.nextInt();

        Arrays.sort(arr);

        if (k >= 1 && k <= n) {
            System.out.println("Kth smallest element = " + arr[k - 1]);
        } else {
            System.out.println("Invalid K");
        }

        sc.close();
    }
}
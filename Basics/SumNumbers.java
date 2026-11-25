import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Find the sum from 1 to: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Enter a non-negative integer.");
            return;
        }
        long sum = (long) n * (n + 1) / 2;
        System.out.println("Sum = " + sum);
    }
}

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        if (n < 1) { System.out.println("Enter at least one number."); return; }
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Number " + i + ": ");
            sum += sc.nextDouble();
        }
        System.out.printf("Average = %.2f%n", sum / n);
    }
}

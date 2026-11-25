import java.util.Scanner;

public class EvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print even numbers up to: ");
        int limit = sc.nextInt();
        if (limit < 0) {
            System.out.println("Please enter a non-negative limit.");
            return;
        }
        for (int i = 2; i <= limit; i += 2) System.out.print(i + " ");
        System.out.println();
    }
}

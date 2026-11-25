import java.util.Scanner;

public class recursionFact {
    static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Number cannot be negative");
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (0-20): ");
        int n = sc.nextInt();
        if (n < 0 || n > 20) { System.out.println("Choose a value from 0 to 20."); return; }
        System.out.println(n + "! = " + factorial(n));
    }
}

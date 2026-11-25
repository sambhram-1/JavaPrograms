import java.util.Scanner;

public class recursionF {
    static long fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Fibonacci terms (1-40): ");
        int n = sc.nextInt();
        if (n < 1 || n > 40) { System.out.println("Choose a term count from 1 to 40."); return; }
        for (int i = 0; i < n; i++) System.out.print(fibonacci(i) + (i + 1 == n ? "\n" : " "));
    }
}

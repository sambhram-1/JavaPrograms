import java.util.Scanner;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        if (n < 1) { System.out.println("Size must be positive."); return; }
        int even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            if (sc.nextInt() % 2 == 0) even++; else odd++;
        }
        System.out.println("Even elements: " + even);
        System.out.println("Odd elements : " + odd);
    }
}

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        if (n < 1) { System.out.println("Size must be positive."); return; }
        int[] a = new int[n];
        long sum = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); sum += a[i];
            min = Math.min(min, a[i]); max = Math.max(max, a[i]);
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum / (double) n));
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.print("Search value: ");
        int target = sc.nextInt(), index = -1;
        for (int i = 0; i < n; i++) if (a[i] == target) { index = i; break; }
        System.out.println(index >= 0 ? "Found at index " + index : "Not found");
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        if (n < 1) { System.out.println("Size must be positive."); return; }
        int[] values = new int[n];
        for (int i = 0; i < n; i++) values[i] = sc.nextInt();
        for (int left = 0, right = n - 1; left < right; left++, right--) {
            int temp = values[left]; values[left] = values[right]; values[right] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(values));
    }
}

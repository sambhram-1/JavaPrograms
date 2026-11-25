import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        if (n < 0) { System.out.println("Size cannot be negative."); return; }
        Set<Integer> unique = new LinkedHashSet<>();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) unique.add(sc.nextInt());
        System.out.println("Without duplicates: " + unique);
    }
}

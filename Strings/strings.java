import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String value = sc.nextLine();
        String reversed = new StringBuilder(value).reverse().toString();
        String normalized = value.replaceAll("\\s+", "").toLowerCase();
        String normalizedReverse = new StringBuilder(normalized).reverse().toString();
        System.out.println("Reversed: " + reversed);
        System.out.println("Palindrome (ignoring spaces/case): " + normalized.equals(normalizedReverse));
    }
}

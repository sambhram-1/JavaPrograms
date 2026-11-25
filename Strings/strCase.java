import java.util.Locale;
import java.util.Scanner;

public class strCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.println("Uppercase: " + text.toUpperCase(Locale.ROOT));
        System.out.println("Lowercase: " + text.toLowerCase(Locale.ROOT));
        System.out.println("Length: " + text.length());
    }
}

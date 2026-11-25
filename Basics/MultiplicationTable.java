import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter table length: ");
        int length = sc.nextInt();
        if (length < 1) {
            System.out.println("Length must be positive.");
            return;
        }
        for (int i = 1; i <= length; i++)
            System.out.printf("%d x %d = %d%n", number, i, number * i);
    }
}

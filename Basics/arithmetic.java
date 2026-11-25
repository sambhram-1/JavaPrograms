import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Addition       = " + (a + b));
        System.out.println("Subtraction    = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        if (b == 0) System.out.println("Division       = undefined (division by zero)");
        else System.out.println("Division       = " + (a / b));
    }
}

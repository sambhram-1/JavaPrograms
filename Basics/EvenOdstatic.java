import java.util.Scanner;

public class EvenOdstatic {
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        System.out.println(number + (isEven(number) ? " is even." : " is odd."));
    }
}

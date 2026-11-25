import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        if (rows < 1 || rows > 9) {
            System.out.println("Choose a row count from 1 to 9.");
            return;
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }
    }
}

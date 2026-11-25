import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = sc.nextDouble();
        if (radius < 0) { System.out.println("Radius cannot be negative."); return; }
        System.out.printf("Area = %.2f%nCircumference = %.2f%n", Math.PI * radius * radius, 2 * Math.PI * radius);
    }
}

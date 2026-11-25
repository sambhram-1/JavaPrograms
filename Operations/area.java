import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rectangle length and width: ");
        double length = sc.nextDouble(), width = sc.nextDouble();
        if (length < 0 || width < 0) { System.out.println("Dimensions cannot be negative."); return; }
        System.out.println("Area = " + (length * width));
    }
}

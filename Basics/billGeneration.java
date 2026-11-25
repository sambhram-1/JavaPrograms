import java.util.Scanner;

public class billGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Item name: ");
        String item = sc.nextLine();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Unit price: ");
        double price = sc.nextDouble();
        if (quantity < 0 || price < 0) {
            System.out.println("Quantity and price cannot be negative.");
            return;
        }
        double subtotal = quantity * price;
        double tax = subtotal * 0.05;
        System.out.printf("%n----- BILL -----%nItem: %s%nQuantity: %d%nSubtotal: %.2f%nTax (5%%): %.2f%nTotal: %.2f%n",
                item, quantity, subtotal, tax, subtotal + tax);
    }
}

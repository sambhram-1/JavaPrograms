import java.util.Scanner;

public class login {
    // A simple classroom example only; real authentication needs secure password storage.
    public static void main(String[] args) {
        final String demoUser = "student";
        final String demoPassword = "java123";
        Scanner sc = new Scanner(System.in);
        System.out.print("Username (demo: student): ");
        String user = sc.nextLine();
        System.out.print("Password (demo: java123): ");
        String password = sc.nextLine();
        System.out.println(user.equals(demoUser) && password.equals(demoPassword)
                ? "Login successful" : "Invalid username or password");
    }
}

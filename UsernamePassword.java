import java.util.Scanner;

public class UsernamePassword {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String user = scanner.nextLine();
        System.out.print("Password: ");
        String pass = scanner.nextLine();
        
        System.out.println((USERNAME.equals(user) && PASSWORD.equals(pass)) ? "Access Granted" : "Access Denied");
        scanner.close();
    }
}

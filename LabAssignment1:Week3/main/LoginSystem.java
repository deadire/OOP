package main;

import users.UserManager;
import java.util.Scanner;
import java.io.Console;

public class LoginSystem {
    private static UserManager registeredUser = new UserManager("rumaan", "dateofbirth");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        LoginHandler loginHandler = new LoginHandler();
        if (loginHandler.authenticate(username, password)) {
            System.out.println("Correct Password! Welcome");
        } else {
            System.out.println("Invalid Password! Try Again");
        }

        scanner.close();
    }

    private static class LoginHandler {
        public boolean authenticate(String username, String password) {
            return registeredUser.getUsername().equals(username) &&
                   registeredUser.authenticate(password);
        }
    }
}

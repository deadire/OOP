package util;

public class PasswordValidator {
    public static boolean validatePassword(String actualPassword, String inputPassword) {
        if (actualPassword.equals(inputPassword)) {
            return true;  
        } else {
            return false; 
        }
    }
}

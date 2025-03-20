package users;

import util.PasswordValidator;

public class UserManager {
    private String user;
    private String pass;

    public UserManager(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public boolean authenticate(String inputPassword) {
        return PasswordValidator.validatePassword(this.pass, inputPassword);
    }

    public String getUsername() {
        return user;
    }
}

package Models;

public class User {

    private String email;
    private String password;

    public User(String mail, String password) {
        this.email = mail;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}

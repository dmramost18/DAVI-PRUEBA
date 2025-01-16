package Models;

public class User {

    private String email;
    private String password;

    public User(String mail, String number) {
        this.email = mail;
        this.password = number;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}

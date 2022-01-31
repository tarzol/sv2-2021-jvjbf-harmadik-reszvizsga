package vehiclerental;

public class User {

    private String userName;
    private String email;
    private int balance;

    public User(String userName, String email, int balance) {
        this.userName = userName;
        this.email = email;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int minusBalance(int amount) {
        return balance-amount;
    }
}

package by.les05;

public abstract class Card {
    String userName;
    double account;

    public Card(String userName, double account) {
        this.userName = userName;
        this.account = account; }

    public String getUserName() {
        return userName;

    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    abstract double getCardBalance();

    abstract double addMoney(double money);

    abstract double getMoney(double money);

    abstract double changeMoney(double course);

}


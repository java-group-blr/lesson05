public class Card {
     String name;
     double balance;

    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;

    }

    public Card(String name) {
        this.name = name;
        this.balance = Math.random() * 150;
    }

    public void getBalance() {
        System.out.println(balance);
    }

    public double addMoney(double add) {
        balance = balance + add;
        return balance;
    }

    public double minusMoney(double minus) {
        balance = balance - minus;
        return balance;
    }
    public void getBalanceByUSD(double cource) {
        System.out.println(balance/cource);
    }
}

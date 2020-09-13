public class DebitCard extends Card {
    public DebitCard(String name, double balance) {
        super(name, balance);
    }

    @Override
    public double minusMoney(double minus) {
        if (balance >= minus) {
            balance = balance - minus;
            return balance;
        } else {
            System.out.println("У Вас не достаточно средств");
            return balance;
        }
    }
}

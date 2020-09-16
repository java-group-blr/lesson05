public class DebitCard extends Card {

    public DebitCard(String name, double money) {
        super(name, money);
    }

    public DebitCard(String name) {
        super(name);
    }

    @Override
    public void getMoneyFromCard(double money) {
        if (money > this.getCardBalance()) {
            System.out.println("Слишком большая сумма");
        } else super.getMoneyFromCard(money);
    }
}

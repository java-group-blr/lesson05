



public class DebitCard extends Card {
    public DebitCard(String name, double balance) {
        super(name, balance);
    }

    @Override
    public double minus(double minus) {
        if (balans >= minus) {
            balans = balans - minus;
            System.out.println("Операция произведена успешно!");
            return balans;
        } else {
            System.out.println("Данная услуга вам недоступна.");
            System.out.println("Не достатояно средств!");
            return balans;
        }
    }
}
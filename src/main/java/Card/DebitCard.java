package Card;

public class DebitCard extends Card {
    protected double percent;
    protected int day;

    // Только для подарочного счёта
    public DebitCard(String name) {
        super(name);
    }

    // Решил добавить от себя метод депозита
    public Double deposit(double percent, int day) {
        double deposit = (balance * percent / day) / 100;
        System.out.println("Через год вы получите с процентами сумму в : " + deposit);
        return deposit;
    }
}

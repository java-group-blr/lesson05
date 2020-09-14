package Card;

public class DebitCard extends Card {
    protected double percent;
    protected int day;

    // Только для подарочного счёта
    public DebitCard(String name) {
        super(name);
    }

    @Override
    public void printBalance() {
        super.printBalance();
    }

    @Override
    public Double topUp(double add) {
        return super.topUp(add);
    }

    // Решил добавить от себя метод депозита
    public Double deposit(double percent, int day) {
        double deposit = (balance * percent / day) / 100;
        System.out.println("Через год вы получите с процентами сумму в : " + deposit);
        return deposit;
    }

    // Реализован в супер классе (Не позволяет снять в отрицательный баланс)
    @Override
    public double withDraw(double min) {
        return super.withDraw(min);
    }
}
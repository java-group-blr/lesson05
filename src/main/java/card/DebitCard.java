package card;

public class DebitCard extends Card {
    // Только для подарочного счёта
    public DebitCard(String name) {
        super(name);
    }

    @Override
    public void withDraw(double min) {
        balance -= min;
        if (min > balance) {
            System.out.println("Извините у вас не достаточно средств");
        } else {
            System.out.println("Вы сняли сумму в " + min + " " + "сумма на счету " + balance);
        }
    }

    public void deposit(double percent, int day) {
        balance = (balance * percent / day) / 100;
        System.out.println("Через год вы получите с процентами сумму в : " + balance);
    }
}
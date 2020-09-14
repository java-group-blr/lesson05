package card;

public class CreditCard extends Card {
    // Только для основного счёта.
    public CreditCard(String name, double balance) {
        super(name, balance);

    }

    @Override
    public void withDraw(double min) {
        balance -= min;
        if (min <= balance)
            System.out.println("Вы сняли сумму в " + min + " " + "сумма на счету " + balance);
        else
            System.out.println("Вы сняли сумму в " + min + " " + ". Внимание!!! Вы взяли кредит. Задолженность на счету : " + balance);
    }
}
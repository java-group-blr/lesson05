package Card;

public class CreditCard extends Card {
    // Только для основного счёта.
    public CreditCard(String name, double balance) {
        super(name, balance);
    }

    // Одобряем кредит
    @Override
    public double withDraw(double min) {
        double credit = balance - min;
        if (min <= balance)
            System.out.println("Вы сняли сумму в " + min + " " + "сумма на счету " + credit);
        else
            System.out.println("Вы сняли сумму в " + min + " " + ". Внимание!!! Вы взяли кредит. Задолженность на счету : " + credit);
        return credit;
    }

    @Override
    public Double topUp(double add) {
        return super.topUp(add);
    }

    @Override
    public void printBalance() {
        super.printBalance();
    }
}
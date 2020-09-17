package by.les05;

public class CreditCard extends Card {
    public CreditCard(String userName, double account) {
        super(userName, account);
    }

    double getCardBalance() {
        System.out.println("Текущий баланс кредитки " + account + " USD");
        return account;
    }

    double addMoney(double money) {
        System.out.println("На ваш баланс зачислено " + money + " USD");
        return (account += money);
    }

    double getMoney(double money) {
        System.out.println("С вашего баланса снято " + money + " USD");
        return (account -= money);
    }

    double changeMoney(double course) {
        double moneyBY = course * account;
        System.out.println("В пересчете с USD Ваш баланс составляет " + moneyBY + " белорусских рублей");
        return moneyBY;
    }
}

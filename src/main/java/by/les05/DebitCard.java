package by.les05;

public class DebitCard extends Card{
    public DebitCard(String userName, double account) {
        super(userName, account);
    }

    double getCardBalance() {
        System.out.println("Текущий баланс дебетовой карты " + account + " USD");
        return account;
    }

    double addMoney(double money) {
        System.out.println("На баланс дебетовой карты зачислено " + money + " USD");
        return (account += money);
    }

    double getMoney(double money) {

        if ( (account - money) < 0 ) {System.out.println("На балансе дебетовой карты недостаточно средств");}
        else {account -= money;
            System.out.println("C баланса дебетовой карты списано " + money + " USD");}
        return money;
    }

    double changeMoney(double course) {
        double moneyBY = course * account;
        System.out.println("В пересчете с USD, баланс дебетовой карты составляет " + moneyBY + " белорусских рублей");
        return moneyBY;
            }
}

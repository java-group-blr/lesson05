package by.lesson05;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCardUserId1 = new CreditCard("Сергей Николаевич", 300000);

        creditCardUserId1.addMoney(200);
        creditCardUserId1.getCardBalance();
        creditCardUserId1.getMoney(1000);
        creditCardUserId1.getCardBalance();
        creditCardUserId1.changeMoney(2.58);

        System.out.println("_______________________________________");

        DebitCard debitCardUserId1 = new DebitCard("Сергей Николаевич", 100000);
        debitCardUserId1.addMoney(20000);
        debitCardUserId1.getCardBalance();
        debitCardUserId1.getMoney(100000);
        debitCardUserId1.getCardBalance();
        debitCardUserId1.changeMoney(2.58);

    }
}

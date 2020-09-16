public class Test {
    public static void main(String[] args) {
        Card card1 = new Card("Vasiliy Petrov");
        Card card2 = new Card("Nikolay Zaycev", 2000);

        System.out.println(card1.getCardBalance());
        System.out.println(card2.getCardBalance());

        card1.addMoneyToCard(322);
        card1.showBalance();
        card1.showBalanceInEuro(0.82);

        card1.getMoneyFromCard(400);
        card1.showBalance();

        DebitCard dc = new DebitCard("Sergey Ivanov", 3220);
        dc.showBalance();

        DebitCard dc1 = new DebitCard("Ivan Nemirov");
        dc1.getMoneyFromCard(1000);
        dc1.showBalance();

        CreditCard cc = new CreditCard("Dmitry Soloduha");
        cc.getCardBalance();
        cc.getMoneyFromCard(10000);

    }
}

public class Card {
    private String cardHolderName;
    private double cardBalance;

    public Card(String cardHolderName, double cardBalance) {
        this.cardHolderName = cardHolderName;
        this.cardBalance = cardBalance;
    }

    public Card(String cardHolderName) {
        this.cardHolderName = cardHolderName;
        this.cardBalance = 300;
    }


    public double getCardBalance() {
        return cardBalance;
    }

    public void addMoneyToCard(double money) {
        this.cardBalance += money;
    }

    public void getMoneyFromCard(double money) {
        this.cardBalance -= money;
    }

    void showBalanceInEuro(double course) {
        String formattedDouble = String.format("%.2f", cardBalance * course);
        System.out.println(formattedDouble);
    }

    void showBalance() {
        System.out.println(cardBalance);
    }


}

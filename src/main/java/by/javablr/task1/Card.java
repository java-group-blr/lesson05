package by.javablr.task1;

abstract public class Card {
    private String cardHolderName;
    private double cardBalance;

    public Card(String cardHolderName, double cardBalance) {
        this.cardHolderName = cardHolderName;
        this.cardBalance = cardBalance;
    }

    public Card(String cardHolderName) {
        this.cardHolderName = cardHolderName;
        this.cardBalance = 999.00;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public double getCardBalanceInCurrency(double currencyRate) {
        return cardBalance / currencyRate;
    }

    public void rechargeBalance(double sumOfMoney) {
        cardBalance += sumOfMoney;
    }

    public void withdrawalBalance(double sumOfMoney) {
        cardBalance -= sumOfMoney;
    }
}
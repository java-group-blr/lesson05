public class Main {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard("Qwery", 32);
        debitCard.minusMoney(33);
        debitCard.getBalance();
        debitCard.minusMoney(40);
        debitCard.getBalance();
        CreditCard creditCard = new CreditCard("ds", 35);
        creditCard.minusMoney(33);
        creditCard.getBalance();
        creditCard.minusMoney(40);
        creditCard.getBalance();
    }
}

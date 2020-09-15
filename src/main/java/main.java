

class Main {
    public static void main(String[] args) {


                DebitCard debitCard = new DebitCard("Федор", 150);
                debitCard.getBalans();
                debitCard.getUSD(2.99);
                debitCard.minus(170);
                debitCard.getBalans();
                debitCard.minus(145);
                debitCard.getBalans();
                debitCard.getUSD(2.99);
                debitCard.add(10);
                debitCard.getBalans();
                debitCard.getUSD(2.99);
                CreditCard creditCard = new CreditCard("Федор", 300);
                creditCard.getBalans();
                creditCard.getUSD(2.99);
                creditCard.minus(170);
                creditCard.getBalans();
                creditCard.getUSD(2.99);
                creditCard.minus(210);
                creditCard.getUSD(2.99);

        DebitCard debitCard1 = new DebitCard("Aня", 100);
        debitCard1.getBalans();
        debitCard1.getUSD(2.99);
        debitCard1.minus(99);
        debitCard1.getBalans();
        debitCard1.minus(145);
        debitCard1.getBalans();
        debitCard1.getUSD(2.99);
        debitCard1.add(1000);
        debitCard1.getBalans();
        debitCard1.getUSD(2.99);
        CreditCard creditCard1 = new CreditCard("Аня", 100);
        creditCard1.getBalans();
        creditCard1.getUSD(2.99);
        creditCard1.minus(25);
        creditCard1.getBalans();
        creditCard1.getUSD(2.99);
        creditCard1.minus(210);
        creditCard1.getUSD(2.99);


            }

}

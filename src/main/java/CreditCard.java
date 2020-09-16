public class CreditCard extends Card {
    public CreditCard(String name, double money) {
        super(name, money);
    }

    public CreditCard(String name) {
        super(name);
    }

    @Override
    public void getMoneyFromCard(double money) {
        super.getMoneyFromCard(money);
        if (this.getCardBalance() < 0){
            System.out.println("Ваш долг составляет " + this.getCardBalance());
        } else System.out.println("Спасибо что воспользовались услугами нашего банка");
    }
}

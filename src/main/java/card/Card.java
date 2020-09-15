package card;

/* Класс банковские карты
   Вывод баланса . Пополнить баланс. Снять деньги . Конвертер валют .
 */
public class Card {
    private String name;
    protected double balance;

    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Card(String name) {
        this.name = name;
        this.balance = Math.random() * 300;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printBalance() {
        System.out.println("Баланс вашего счета состовляет : " + balance);
    }

    public void topUp(double add) {
        balance += add;
        System.out.println("Вы пополнили счёт на " + add + " " + "вам доступно " + balance);
    }

    public void withDraw(double min) {
        balance -= min;
        System.out.println("Вы сняли сумму в " + min + " " + "сумма на счету " + balance);
    }

    public void converter(double con, String name) {
        double converter = (balance / con);
        System.out.println("При покупки " + name + " " + "по курсу " + con + " " + "вы приобретете " + converter + "Ашчушчэня");
    }
}
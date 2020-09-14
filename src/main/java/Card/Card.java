package Card;

/* Класс банковские карты
   Вывод баланса . Пополнить баланс. Снять деньги . Конвертер валют .
 */
public class Card {
    protected String name;
    protected double balance;

    // Пустой конструктор
    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Конструктор с подарочным балансом
    public Card(String name) {
        this.name = name;
        this.balance = Math.random() * 300;
    }

    // Создаем геттеры и сеттеры
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

    // Создаем методы класса
    // Вывод баланса
    public void printBalance() {
        System.out.println("Баланс вашего счета состовляет : " + balance);
    }

    // Пополнить баланс
    public Double topUp(double add) {
        double resoultUp = balance + add;
        System.out.println("Вы пополнили счёт на " + add + " " + "вам доступно " + resoultUp);
        return resoultUp;
    }

    // Снятие средств
    public double withDraw(double min) {
        double resoultMin = balance - min;
        if (min > balance) {
            System.out.println("Извините у вас не достаточно средств");
        } else {
            System.out.println("Вы сняли сумму в " + min + " " + "сумма на счету " + resoultMin);

        }
        return resoultMin;
    }

    // Конвертер валют
    public void converter(double con, String name) {
        double converter = (balance / con);
        System.out.println("При покупки " + name + " " + "по курсу " + con + " " + "вы приобретете " + converter + "Ашчушчэня");
    }
}
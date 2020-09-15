

public class Card {
    String name;
    double balans;

    public Card(String name, double balans) {
        this.name = name;
        this.balans = balans;
        System.out.println(name);
        System.out.println("Зачислено: " + balans);
    }

    public double getBalans() {
        System.out.println("Ваш баланс: " + balans);
        return balans;
    }

    public double add(double add) {
        balans = balans + add;
        System.out.println("Пополнение счета на - " + add);
        System.out.println("Баланс составил: " + balans);
        return balans;
    }

    public double minus(double minus) {
        balans = balans - minus;
        System.out.println("Снятие со счета -"+ minus);
        System.out.println("Баланс составил: " + balans);
        return balans;
    }

    public void getUSD(double cource) {
        System.out.println(balans / cource + "$");

    }
}
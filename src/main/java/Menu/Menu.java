package Menu;
import Card.Card;
import java.util.Scanner;

public class Menu {
    // Меню для основного класса
    public void menuCard() {
        Scanner sc = new Scanner(System.in);
        Card card = new Card("Mr.Neelixs", 500.00);

        System.out.println("Меню счёта : ");
        System.out.println("1.Показать баланс ");
        System.out.println("2.Пополнить баланс ");
        System.out.println("3.Снять деньги");
        System.out.println("4.Купить деньги \"Кукловодов\"  ");
        int number1 = sc.nextInt();
        switch (number1) {
            case 1:
                card.printBalance();
                break;
            case 2:
                System.out.println("Введите сумму которую хотите положить : ");
                double add = sc.nextDouble();
                card.topUp(add);
                break;
            case 3:
                System.out.println(" Какую сумму хотите снять ");
                double min = sc.nextDouble();
                card.withDraw(min);
                break;
            case 4:
                System.out.println("На данный момент 1 ед.Кукловода = 2.6 Ашчушчэне ");
                double con = 2.6;
                String name = " Кукловодов ";
                card.converter(con, name);
                break;

        }
    }
    // Меню для Подарочного класса
    public void menuPresent (){
        Scanner sc = new Scanner(System.in);
        Card present = new Card("Mr.Neelixs");

        System.out.println("Меню счёта : ");
        System.out.println("1.Показать баланс ");
        System.out.println("2.Пополнить баланс ");
        System.out.println("3.Снять деньги");
        System.out.println("4.Купить деньги \"Кукловодов\"  ");
        int number1 = sc.nextInt();
        switch (number1) {
            case 1:
              present.printBalance();
                break;
            case 2:
                System.out.println("Введите сумму которую хотите положить : ");
                double add = sc.nextDouble();
                present.topUp(add);
                break;
            case 3:
                System.out.println(" Какую сумму хотите снять ");
                double min = sc.nextDouble();
                present.withDraw(min);
                break;
            case 4:
                System.out.println("На данный момент 1 ед.Кукловода = 2.6 Ашчушчэне ");
                double con = 2.6;
                String name = " Кукловодов ";
                present.converter(con, name);
                break;
        }
    }
}
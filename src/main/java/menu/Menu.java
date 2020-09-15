package menu;

import card.Card;
import card.CreditCard;
import card.DebitCard;

import java.util.Scanner;

public class Menu {
    public void menuCard() {
        Scanner sc = new Scanner(System.in);
        Card card = new Card("Mr.Neelixs", 500.00);
        CreditCard creditCard = new CreditCard("Mr.Neelixs", 300.00);

        System.out.println("     Меню счёта : ");
        System.out.println("1.Показать баланс ");
        System.out.println("2.Пополнить баланс ");
        System.out.println("3.Снять деньги");
        System.out.println("4.Купить деньги \"Кукловодов\"  ");
        System.out.println("5.Кредитная карта. \" За Поцелуи \" ");
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
            case 5:
                System.out.println("1.Баланс карты ");
                System.out.println("2.Снять со счёта  ");
                System.out.println("3.пополнить счёт ");
                int number2 = sc.nextInt();
                switch (number2) {
                    case 1:
                        creditCard.printBalance();
                        break;
                    case 2:
                        System.out.println(" Какую сумму хотите снять ");
                        double minCred = sc.nextDouble();
                        creditCard.withDraw(minCred);
                        break;
                    case 3:
                        System.out.println("Введите сумму которую хотите положить : ");
                        double addCred = sc.nextDouble();
                        creditCard.topUp(addCred);
                        break;
                }
        }
    }
    public void menuPresent() {
        Scanner sc = new Scanner(System.in);
        Card present = new Card("Mr.Neelixs");
        DebitCard debitCard = new DebitCard("Mr.Neelixs");

        System.out.println("     Меню счёта : ");
        System.out.println("1.Показать баланс ");
        System.out.println("2.Пополнить баланс ");
        System.out.println("3.Снять деньги");
        System.out.println("4.Купить деньги \"Кукловодов\"  ");
        System.out.println("5.Депозит  \"На Будку \"  ");
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
            case 5:
                System.out.println("1.Баланс счёта ");
                System.out.println("2.Снять со счёта  ");
                System.out.println("3.Пополнить счёт ");
                System.out.println("4.Депозит ");
                int number2 = sc.nextInt();
                switch (number2) {
                    case 1:
                        debitCard.printBalance();
                        break;
                    case 2:
                        System.out.println(" Какую сумму хотите снять ");
                        double minCred = sc.nextDouble();
                        debitCard.withDraw(minCred);
                        break;
                    case 3:
                        System.out.println("Введите сумму которую хотите положить : ");
                        double addCred = sc.nextDouble();
                        debitCard.topUp(addCred);
                        break;
                    case 4:
                        System.out.println("Депозит на будку под 13.23 % годовых ");
                        debitCard.deposit(13.23, 365);
                        break;
                }
        }
    }
}
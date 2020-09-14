import Menu.Menu;

import java.util.Scanner;

/*
Банковские счета
1.Основному счёту доступен пункт кредит
2.Подарочному счёту доступен пункт депозит
 */
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);


        System.out.println("Добро пожаловать в банк \"ПоПяццот\"");
        System.out.println("Выберете ваш счёт : ");
        System.out.println("1.Основной счёт \"Жирный кот\"");
        System.out.println("2.Подарочный счёт \"Ашчушчэне\"");
        int number = sc.nextInt();
        switch (number) {
            case 1: // Вызов меню основного счёта / Доступен кредит
                menu.menuCard();
                break;
            case 2: // Вызов меню подарочного счёта / Доступен депозит
                menu.menuPresent();
                break;
        }
    }
}
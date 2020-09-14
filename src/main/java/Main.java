import Menu.Menu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu  = new Menu();
        Scanner sc = new Scanner(System.in);

        System.out.println("Добро пожаловать в банк \"ПоПяццот\"");
        System.out.println("Выберете ваш счёт : ");
        System.out.println("1.Основной счёт \"Жирный кот\"");
        System.out.println("2.Подарочный счёт \"Ашчушчэне\"");
        int number = sc.nextInt();
        switch (number){
            case 1 :
                menu.menuCard();
                break;
            case 2:
                menu.menuPresent();
                break;
        }
    }
}
package JavaCore_03;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        String y = "Stop";
        boolean z = true;
        while (z) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название города:");
        String x = scanner.nextLine();
        z = !(x.equals(y));
            switch (x) {
                case "Москва", "Владивосток", "Ростов":
                    System.out.println("Страна: Россия");
                    break;
                case "Рим", "Милан", "Турин":
                    System.out.println("Страна: Италия");
                    break;
                case "Ливерпуль", "Манчестер", "Лондон":
                    System.out.println("Страна: Англия");
                    break;
                case "Берлин", "Мюнхен", "Кёльн":
                    System.out.println("Страна: Германия");
                    break;
                case "Stop":
                    System.out.println("*программа завершила работу*");
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    break;
            }
        }
    }
}

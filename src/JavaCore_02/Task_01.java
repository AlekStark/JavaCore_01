package JavaCore_02;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество этажей:");
        int x = scanner.nextInt();
        if(x>=1 && x<=4){
            System.out.println("Малоэтажный дом");
        }
        else if(x>=5 && x<=8){
            System.out.println("Среднеэтажный дом");
        }
        else if(x>=9){
            System.out.println("Многоэтажный дом");
        }
        else{
            System.out.println("Ошибка ввода");
        }
    }

}
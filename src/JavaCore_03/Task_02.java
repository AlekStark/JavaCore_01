package JavaCore_03;

import java.util.Scanner;
public class Task_02 {
    public static void main(String[] args) {
        double x,y;
        y=1;
        Scanner scanner = new Scanner(System.in);
        while (y!=0) {
            System.out.println("Введите делимое число:");
            x = scanner.nextDouble();
            System.out.println("Введите делитель:");
            y = scanner.nextDouble();
            if(y!=0){
                    System.out.println(x/y);
            }
            else {
                    System.out.println("работа программы завершается");
            }
        }
    }
}

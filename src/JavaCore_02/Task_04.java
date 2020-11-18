package JavaCore_02;

import java.util.Scanner;
import static java.lang.Math.*;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение X число:");
        double x = scanner.nextDouble();
        double y;
        if (x >= 5) {
            y=((pow(x,2))-10)/(x+7);
        } else if (-3 < x && x < 5) {
            y=(x+3)*(pow(x,2)-2);
        } else {
            y=420;
         }
        System.out.println("Y равен " +y);
    }
}
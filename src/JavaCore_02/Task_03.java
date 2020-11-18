package JavaCore_02;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        a++;
        if(a>b){
            System.out.println("Ошибка ввода");
        }
        else {
            int i=a;
            while(i<b){
                if(i%5==0 && i%10!=0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}

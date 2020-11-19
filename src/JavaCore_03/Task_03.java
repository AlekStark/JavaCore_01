package JavaCore_03;

import java.util.Scanner;
public class Task_03 {
    public static void main(String[] args) {
        double x,y;
        int z;
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<=5;i++){
            z=0;
            System.out.println("Введите делимое число:");
            x = scanner.nextDouble();
            System.out.println("Введите делитель:");
            y = scanner.nextDouble();
            if(y!=0)
                z=1;
            switch (z){
                case 1:
                    System.out.println(x/y);
                    break;
                case 0:
                    System.out.println("Деление на 0");
                    break;
            }
        }
    }
}

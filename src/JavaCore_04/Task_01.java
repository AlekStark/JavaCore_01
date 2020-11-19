package JavaCore_04;

import java.util.Arrays;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        int sBig=0,sOne=0,sEven=0,sOdd=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int [] y = new int[scanner.nextInt()];

        for(int i=0; i<y.length;i++) {
            y[i] = (int) (Math.random() * 11);
            System.out.println(y[i]);
        }
        for (int i:y)
        {
            if (i>8)
                sBig++;
            if (i==1)
                sOne++;
            if (i%2==0 && i!=0)
                sEven++;
            if (i%2!=0)
                sOdd++;
        }

        System.out.println("Длине массива: " + y.length);
        System.out.println("Количество чисел больше 8: " + sBig);
        System.out.println("Количество чисел равных 1: " + sOne);
        System.out.println("Количество четных чисел: " + sEven);
        System.out.println("Количество нечетных чисел: " + sOdd);
        System.out.println("Сумма всех элементов массива: " + Arrays.stream(y).sum());
    }
}

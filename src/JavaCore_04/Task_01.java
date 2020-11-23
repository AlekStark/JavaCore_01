package JavaCore_04;

import java.util.Arrays;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        int Big=0,One=0,Even=0,Odd=0;
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
                Big++;
            if (i==1)
                One++;
            if (i%2==0 && i!=0)
                Even++;
            if (i%2!=0)
                Odd++;
        }

        System.out.println("Длине массива: " + y.length);
        System.out.println("Количество чисел больше 8: " + Big);
        System.out.println("Количество чисел равных 1: " + One);
        System.out.println("Количество четных чисел: " + Even);
        System.out.println("Количество нечетных чисел: " + Odd);
        System.out.println("Сумма всех элементов массива: " + Arrays.stream(y).sum());
    }
}

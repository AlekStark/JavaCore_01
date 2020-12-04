package JavaCore_12;

import java.util.ArrayList;
import java.util.List;

public class Task_02 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            if(i!=0 && i%2==0){
                numbers.add(i);
            }
        }
        System.out.println(numbers);
        for (int i = 300; 300<=i &&i <= 350; i++) {
            if(i%2==0){
                numbers.add(i);
            }
        }
        System.out.println(numbers);
    }
}

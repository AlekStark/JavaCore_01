package JavaCore_12;

import java.util.ArrayList;
import java.util.List;

public class Task_01 {
    public static void main(String[] args) {
        List<String> car1 = new ArrayList<>();
        car1.add("BMW");
        car1.add("Audi");
        car1.add("Mercedes");
        car1.add("Lada");
        car1.add("Renault");
        System.out.println(car1);
        car1.add(2,"Taoyta");
        System.out.println(car1);
        car1.remove(0);
        System.out.println(car1);

    }
}

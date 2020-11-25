package JavaCore_08;

public class Task_01 {
    public static void main(String[] args) {
        long st, en, t1, t2;
        st = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.toString());
        for (int i=0;i<=20000;i++) {
            sb.append(Integer.toString(i) + " ");
        }
        en = System.nanoTime();
        t1 = en - st;
        System.out.println(sb.toString());
        //System.out.println("Тест StringBuilder " + String.format("%,12d",t1) + " ns");

        st = System.nanoTime();
        String str = new String();
        for (int j=0;j<=20000;j++) {
            str = str + (Integer.toString(j) + " ");
        }
        en = System.nanoTime();
        t2 = en - st;
        System.out.println(str);
        System.out.println("Тест StringBuilder " + String.format("%,12d",t1) + " ns");
        System.out.println("Тест String " + String.format("%,12d",t2) + " ns");
    }
}

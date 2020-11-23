package JavaCore_04;

public class Task_02_1 {
    public static void main(String[] args) {
        int [] array = new int[100];
        int Greatest=Integer.MIN_VALUE, GreatNum=0, Least=Integer.MAX_VALUE,LeastNum=0, Quantity=0, QuantitySum=0;
        for(int i=0; i<array.length;i++) {
            array[i] = (int) (Math.random() * 1001);
            System.out.println(array[i]);
        }
        for (int i=0; i<array.length; i++){
        //for (int i:array) {
            if (Greatest<array[i]){
                Greatest=array[i];
                GreatNum=i;
            }
            if (Least>array[i]){
                Least=array[i];
                LeastNum=i;
            }
            if(Math.abs(array[i])%10==0){
                Quantity++;
                QuantitySum+=array[i];
            }
        }
        System.out.println("Наибольшее значение: " + Greatest);
        System.out.println("Порядковый номер наибольшего значения: " + GreatNum);
        System.out.println("Наименьшее значение: " + Least);
        //System.out.println("Наименьшее значение: " + Integer.MIN_VALUE);
        System.out.println("Порядковый номер наименьшего значения: " + LeastNum);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + Quantity);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + QuantitySum);
    }
}

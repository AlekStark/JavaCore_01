package JavaCore_04;

public class Task_02 {
    public static void main(String[] args) {
        int [] array = new int[100];
        int sGreatest=0,sGreatNum=0,sLeast=1001,sLeastNum=0, sQuantity=0, sQuantitySum=0;
        for(int i=0; i<array.length;i++) {
            array[i] = (int) (Math.random() * 1001);
            System.out.println(array[i]);
        }
        for (int i=0; i<array.length; i++){
        //for (int i:array) {
            if (sGreatest<array[i]){
                sGreatest=array[i];
                sGreatNum=i;
            }
            if (sLeast>array[i]){
                sLeast=array[i];
                sLeastNum=i;
            }
            if(Math.abs(array[i])%10==0){
                sQuantity++;
                sQuantitySum=sQuantitySum+array[i];
            }
          }
        System.out.println("Наибольшее значение: " + sGreatest);
        System.out.println("Порядковый номер наибольшего значения: " + sGreatNum);
        System.out.println("Наименьшее значение: " + sLeast);
        System.out.println("Порядковый номер наименьшего значения: " + sLeastNum);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + sQuantity);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + sQuantitySum);
    }
}

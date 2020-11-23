package JavaCore_04;

public class Task_04 {
    public static void main(String[] args) {
        int [] array = new int[10];
        int sBig=0;
        int sBigNum=0;
        int arraySum;

        for(int i=0; i<array.length;i++) {
            array[i] = (int) (Math.random() * 10001);
            System.out.print(array[i]+" ");
         }
        System.out.println();
        for (int i=1; i<array.length-1; i++) {
            arraySum=array[i-1]+array[i]+array[i+1];
            if(sBig<arraySum){
                sBig=arraySum;
                sBigNum=i-1;
            }
        }
        System.out.println(sBig);
        System.out.println(sBigNum);
    }
}

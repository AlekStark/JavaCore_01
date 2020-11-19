package JavaCore_04;

public class Task_03 {
    public static void main(String[] args) {
        int [][] array = new int[12][8];
        int sBigSum=0;
        int sum=0;
        int sIndex=0;
        //System.out.println(x.length);

        for(int i=0; i<array.length;i++){
            for (int j=0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random() * 51);
            }
        }
        for(int i=0; i<array.length;i++){
            System.out.print("индекс [" +i+ "] ");
            for (int j=0; j < array[i].length; j++){
                sum=sum+array[i][j];
                System.out.print(array[i][j]);
                System.out.print(" ");
                if(sum>sBigSum){
                    sBigSum=sum;
                    sIndex=i;
                }
              }
            System.out.print(" //сумма - " + sum);
            System.out.println();
        }
        System.out.println("Ответ: " + sIndex);
    }
}

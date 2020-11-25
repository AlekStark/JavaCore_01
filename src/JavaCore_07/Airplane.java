package JavaCore_07;

import java.util.Scanner;

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if(airplane1.getLength()!=0 && airplane2.getLength()!=0){
            if(airplane1.getLength()>airplane2.getLength()) {
                System.out.println("Первый");
            } else if (airplane1.getLength()<airplane2.getLength()){
                System.out.println("Второй");
            } else {
                System.out.println("Равны");
            }
        }else {
            System.out.println("Самолет(ы) угнали");
        }

    }

    public int getLength() {
        return length;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel=0;
    }
    public void setFuel(int fuel){
        this.fuel=fuel;
    }

    void info(){
        System.out.println("Изготовитель: "+producer+", год выпуска: "+year+", длина: "
                +length+ ", вес: "+weight+ ", количество топлива в баке:"+fuel);
    }
    void fillUp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество заправляемого топлива:");
        this.fuel=scanner.nextInt();
        info();
    }

    public int getFuel () {
        return fuel;
    }
}

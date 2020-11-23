package JavaCore_06;

public class Task_01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2018);
        car1.setColor("Красный");
        car1.setModel("KIA");
        car1.info();
        car1.yearDifference();
        Motorbike moto1 = new Motorbike(2018,"Красный","Honda");
        moto1.info();
        moto1.yearDifference();
    }
}

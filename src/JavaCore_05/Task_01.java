package JavaCore_05;

import java.util.Date;

public class Task_01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2018);
        car1.setColor("Red");
        car1.setModel("KIA");
        System.out.println("Год выпуска автомобиля:" + car1.getYearOfIssue());
        System.out.println("Цвет автомобиля:" + car1.getColor());
        System.out.println("Модель автомобиля:" + car1.getModel());
    }
}
class Car{
    private int yearOfIssue;
    private String carColor;
    private String carModel;

    public void setYear(int year){
        yearOfIssue = year;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setColor(String color){
        carColor = color;
    }

    public String getColor() {
        return carColor;
    }

    public void setModel(String model){
        carModel = model;
    }

    public String getModel() {
        return carModel;
    }
}



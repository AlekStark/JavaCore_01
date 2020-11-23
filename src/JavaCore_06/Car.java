package JavaCore_06;

import java.util.Scanner;

class Car {
    private int yearOfIssue;
    private String carColor;
    private String carModel;
//сеттеры
    public void setYear(int year){
        this.yearOfIssue = year;
    }
    public void setColor(String color){
        this.carColor = color;
    }
    public void setModel(String model){
        this.carModel = model;
    }
// геттеры
/*    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public String getColor() {
        return carColor;
    }
    public String getModel() {
        return carModel;
    }*/

    void info(){
        System.out.println("Это автомобиль "+carModel+", "+ yearOfIssue + " года выпуска. Цвет:"+carColor);
    }
    void yearDifference(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int yearDifference = scanner.nextInt();
        System.out.println(yearDifference-yearOfIssue);
    }

}

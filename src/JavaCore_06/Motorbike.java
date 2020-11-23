package JavaCore_06;

import java.util.Scanner;

class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model){
        this.year=year;
        this.color=color;
        this.model=model;
    }
    public int getYearOfIssue() {
        return year;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }

    void info(){
        //System.out.println("Это мотоцикл");
        System.out.println("Это мотоцикл "+model+", "+ year + " года выпуска. Цвет:"+color);
    }
    void yearDifference(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите год:");
            int yearDifference = scanner.nextInt();
            System.out.println(yearDifference-year);
    }
}

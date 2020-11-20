package JavaCore_05;

public class Task_02 {
    public static void main(String[] args) {
        Motorbike moto1 = new Motorbike(2018,"Red","Honda");
        System.out.println("Год выпуска мотоцикла:" + moto1.getYearOfIssue());
        System.out.println("Цвет мотоцикла:" + moto1.getColor());
        System.out.println("Модель мотоцикла:" + moto1.getModel());

    }
}
class Motorbike{
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
}

package JavaCore_05;

public class Car {
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

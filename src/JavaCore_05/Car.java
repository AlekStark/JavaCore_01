package JavaCore_05;

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
//геттеры
    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public String getColor() {
        return carColor;
    }
    public String getModel() {
        return carModel;
    }

}

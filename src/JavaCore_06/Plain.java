package JavaCore_06;

public class Plain {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void setProducer(String producer){
        this.producer=producer;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setLength(int length){
        this.length=length;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public void setFuel(int fuel){
        this.fuel=fuel;
    }
    void info(){

        Airplane airplane=new Airplane(producer,year,length, weight);
        airplane.setFuel(50);
        airplane.info();
    }

}


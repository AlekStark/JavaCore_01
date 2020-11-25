package JavaCore_07;

public class Task_01 {
    public static void main(String[] args) {
        Airplane airplane1= new Airplane( "AirBus", 2010, 0, 20);
        Airplane airplane2 = new Airplane("AirBus", 2010, 5, 20);
        Airplane.compareAirplanes(airplane1,airplane2);
    }
}

package JavaCore_06;

public class Task_02 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus", 2000, 20, 10 );
        airplane1.info();
        airplane1.fillUp();
        Plain plain = new Plain();
        plain.setProducer("Аэрофлот");
        plain.setYear(2010);
        plain.setLength(30);
        plain.setWeight(20);
        plain.setFuel(10);
        plain.info();
    }
}

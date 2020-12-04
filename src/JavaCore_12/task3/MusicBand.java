package JavaCore_12.task3;

public class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Музыкальные группы { " +
                "Название: '" + name + '\'' +
                ", год основания: " + year +
                '}';
    }
}

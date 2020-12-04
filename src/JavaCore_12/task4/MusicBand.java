package JavaCore_12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String>musicArtist;

    public MusicBand(String name, int year, List<String>musicArtist) {
        this.name = name;
        this.year = year;
        this.musicArtist = musicArtist;
    }

    public String getName() {
        return name;
    }

/*    public List<MusicArtist> getMusicArtist() {
        return musicArtist;
    }*/

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Музыкальные группы { " +
                "Название: '" + name + '\'' +
                ", год основания: " + year +
                ", участник(и): " + musicArtist +
                '}';
    }
    public static void transferMembers(MusicBand MusicBand1, MusicBand MusicBand2){
        MusicBand1.musicArtist.addAll(MusicBand2.musicArtist);
        MusicBand2.musicArtist.clear();

        System.out.println("Группа 1: "+MusicBand1);
        System.out.println("Группа 2: "+MusicBand2);
    }
}

package JavaCore_12;
import JavaCore_12.task5.MusicBand;
import JavaCore_12.task5.MusicArtist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_05 {
    public static void main(String[] args) {
        List<MusicArtist>musicArtist1=new ArrayList<>();
        List<MusicArtist>musicArtist2=new ArrayList<>();
        musicArtist1.add(new MusicArtist("я не знаю музыкантов", 20));
        musicArtist1.add(new MusicArtist("крутой чувак", 30));
        musicArtist1.add(new MusicArtist("еще один чувак",40));

        musicArtist2.add(new MusicArtist("ну хоть так",50));
        musicArtist2.add(new MusicArtist("барабанщик",23));
        musicArtist2.add(new MusicArtist("гитарист",33));



        List<JavaCore_12.task5.MusicBand> bands = new ArrayList<>(Arrays.asList(
                new MusicBand("Imagine Dragons", 2008, musicArtist1),
                new MusicBand("Queen", 1970, musicArtist1),
                new MusicBand("AC/DC", 1973, musicArtist2),
                new MusicBand("IOWA", 2007, musicArtist2)));

        System.out.println(bands.get(1));

        MusicBand.transferMembers(bands.get(1), bands.get(2));
    }
}

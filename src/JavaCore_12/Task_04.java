package JavaCore_12;

import JavaCore_12.task4.MusicBand;
//import JavaCore_12.task4.MusicArtist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_04 {
    public static void main(String[] args) {
        List<String>musicArtist1=new ArrayList<>();
        List<String>musicArtist2=new ArrayList<>();
        musicArtist1.add("я не знаю музыкантов");
        musicArtist1.add("крутой чувак");
        musicArtist1.add("еще один чувак");

        musicArtist2.add("ну хоть так");
        musicArtist2.add("барабанщик");
        musicArtist2.add("гитарист");



        List<JavaCore_12.task4.MusicBand> bands = new ArrayList<>(Arrays.asList(
                new MusicBand("Imagine Dragons", 2008, musicArtist1),
                new MusicBand("Queen", 1970, musicArtist1),
                new MusicBand("AC/DC", 1973, musicArtist2),
                new MusicBand("IOWA", 2007, musicArtist2)));

        System.out.println(bands.get(1));

        MusicBand.transferMembers(bands.get(1), bands.get(2));
    }
}

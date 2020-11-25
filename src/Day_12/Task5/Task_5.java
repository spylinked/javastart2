package Day_12.Task5;

import MyUtils.generate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_5 {
    public static void main(String[] args) {
        String[] bandComb;
        String[] fio;
        List<MusicBand> bandList = new ArrayList<>();
        List<MusicArtist> artistList = new ArrayList<>();
        Random rnd = new Random();
        //создаем артистов
        /*
        for (int i = 0; i < 50; i++) {
            fio = generate.generateName();
            artistList.add(new MusicArtist(fio[1] + " " + fio[0],rnd.nextInt(40)+18));
        }

        //пишем артистов
        for (MusicArtist artist : artistList) {
            System.out.println(artist);
        }
        */
        //создаем группы
        for (int i = 0; i < 10; i++) {
            bandComb = generate.generateStrangeWordCombinationPlural();
            bandList.add(new MusicBand(bandComb[0] + " " + bandComb[1], rnd.nextInt(40)+1980));
        }
        //Добавляем артистов в группы
        for (MusicBand band : bandList) {
            while (band.getMembers().size()<band.getMaxArtist()) {
                fio = generate.generateName();
                band.addMember(new MusicArtist(fio[1] + " " + fio[0],rnd.nextInt(40)+18));
            }
        }
        for (MusicBand band: bandList) {
            band.printMembers();
        }

        System.out.println("\nTRANSFER\n");
        MusicBand.transferMembers(bandList.get(rnd.nextInt(bandList.size())),bandList.get(rnd.nextInt(bandList.size())));

        for (MusicBand band: bandList) {
            band.printMembers();
        }
    }
}

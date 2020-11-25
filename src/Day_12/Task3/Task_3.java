package Day_12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        List<MusicBand> bandList = new ArrayList<MusicBand>();

        bandList.add(new MusicBand("Битые кастрюли", 2001));
        bandList.add(new MusicBand("Молчаливые шакалы", 1998));
        bandList.add(new MusicBand("Статные девки", 2010));
        bandList.add(new MusicBand("Поломанные шпалы", 1975));
        bandList.add(new MusicBand("Красивые халаты", 2015));
        bandList.add(new MusicBand("Застенчивые зеркала", 2020));
        bandList.add(new MusicBand("Я и мы", 1960));
        bandList.add(new MusicBand("Грозные пульты", 2000));
        bandList.add(new MusicBand("Узкие штаны", 1999));
        bandList.add(new MusicBand("Ласковые пробки", 1972));

        System.out.println("Created");
        System.out.println(bandList);
        System.out.println();

        Collections.shuffle(bandList);
        System.out.println("Shuffle");
        System.out.println(bandList);
        System.out.println();

        System.out.println("Final");
        System.out.println(bandList);
        System.out.println(groupsAfter2000(bandList));

    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandListAfter2000 = new ArrayList<MusicBand>();
        for (MusicBand band : bands) {
            if (band.getYear() >= 2000) {
                bandListAfter2000.add(band);
            }
        }
        return bandListAfter2000;
    }
}


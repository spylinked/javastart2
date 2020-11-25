package Day_12.Task4;

import Day_12.Task4.MusicBand;
import MyUtils.generate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        String[] bandComb;
        String[] fio;
        List<MusicBand> bandList = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            bandComb = generate.generateStrangeWordCombinationPlural();
            bandList.add(new MusicBand(bandComb[0] + " " + bandComb[1], rnd.nextInt(40)+1980));
            for (int j = 0; j < 3; j++) {
                fio = generate.generateNameM();
                bandList.get(i).addMember(fio[1] + " " + fio[0]);
            }

        }

        for (MusicBand band: bandList) {
            band.printMembers();
        }
        System.out.println("\nREMOVE ONE\n");
        int bandIndex = rnd.nextInt(bandList.size());
        bandList.get(bandIndex).removeMember(bandList.get(bandIndex).getMembers().get(rnd.nextInt(bandList.get(bandIndex).getMembers().size())));

        System.out.println("\nTRANSFER\n");
        MusicBand.transferMembers(bandList.get(rnd.nextInt(bandList.size())),bandList.get(rnd.nextInt(bandList.size())));

        for (MusicBand band: bandList) {
            band.printMembers();
        }

    }
}

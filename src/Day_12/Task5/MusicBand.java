package Day_12.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members = new ArrayList<MusicArtist>();
    private Random rnd = new Random();
    private final int MAX_ARTIST;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
        this.MAX_ARTIST = rnd.nextInt(4)+2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public int getMaxArtist() {
        return MAX_ARTIST;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void addMember (MusicArtist artist) {
        this.members.add(artist);
        artist.addToBand(this);
    }

    public void removeMember(MusicArtist artist) {
        //members.remove(members.indexOf(member));
        System.out.println("Удаляем " + artist.getName() + " из " + name);
        members.remove(artist);
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.print("Участники группы " + getName() + ": ");
        for (MusicArtist artist : this.members) {
            System.out.print(artist.getName() + ", ");
        }
        System.out.println();
    }

    public static void transferMembers(MusicBand fromBand, MusicBand toBand) {
        toBand.members.addAll(fromBand.members);
        fromBand.members.clear();
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

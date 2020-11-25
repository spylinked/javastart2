package Day_12.Task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members = new ArrayList<String>();

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }
    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
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

    public void setYear(int year) {
        this.year = year;
    }

    public void addMember (String name) {
        this.members.add(name);
    }

    public void removeMember(String member) {
        //members.remove(members.indexOf(member));
        System.out.println("Удаляем " + member + " из " + name);
        members.remove(member);
    }

    public List<String> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.print("Участники группы " + getName() + ": ");
        for (String member : this.members) {
            System.out.print(member + ", ");
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

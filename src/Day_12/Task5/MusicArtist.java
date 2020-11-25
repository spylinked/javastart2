package Day_12.Task5;

public class MusicArtist {
    private int age;
    private String name;
    private MusicBand band;

    public MusicArtist(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addToBand(MusicBand band){
        this.band = band;
    }

    public MusicBand getBand() {
        return band;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

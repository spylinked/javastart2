package Day_7;

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: "+ producer +", год выпуска: " + year + " , длина: "+ length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public int getLength() {
        return length;
    }

    public String getProducer() {
        return producer;
    }

    public void fillUp(int fillFuel) {
        this.fuel = this.fuel + fillFuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void compareAirplanes(Airplane plane1, Airplane plane2) {
        if (plane1.getLength() > plane2.getLength()) {
            System.out.println("Самолёт " + plane1.getProducer() + " длинее чем " + plane2.getProducer() + " на " + (plane1.getLength()-plane2.getLength()));
        } else {
            System.out.println("Самолёт " + plane2.getProducer() + " длинее чем " + plane1.getProducer() + " на " + (plane2.getLength()-plane1.getLength()));
        }
    }
}

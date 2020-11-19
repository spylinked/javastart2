package Day_7;


public class Airplanes {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Bombardier", 2010, 67, 1700);
        Airplane plane2 = new Airplane("Boeing", 2007, 120, 3200);
        Airplane.compareAirplanes(plane1,plane2);
    }
}

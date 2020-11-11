package Day_1;

public class OlympicGamesFor {
    public static void main(String[] args) throws Exception {
        for (int year = 1980; year < 2021; year++) {
            if (year <= 1993) {
                if (year%4 == 0){
                    System.out.println("Олимпийские игры " + year + " года.");
                }
            }
            else {
                if (year%4 == 0) {
                    System.out.println("Летние олимпийские игры " + year + " года.");
                }
                else if (year%2 == 0) {
                    System.out.println("Зимние олимпийские игры " + year + " года.");
                }
            }
        }
    }
}

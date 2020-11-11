package Day_1;

public class OlympicGamesWhile {
    public static void main(String[] args) throws Exception {
        //System.out.println(1962%2);
        int year = 1980;
        while (year < 2021) {
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
            year++;
        }
    }
}

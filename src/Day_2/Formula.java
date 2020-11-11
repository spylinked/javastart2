package Day_2;

import java.util.Scanner;

public class Formula {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число X");
        while (!scan.hasNextDouble()) {
            System.out.println("Это не число");
            scan.next();
        }
        double x = scan.nextDouble();
        double y = 0;
        if(x>=5){
            y = (Math.pow(x,2) - 10) / (x + 7);
        }
        else if (x > -3 && x < 5) {
            y = (x+3)*(Math.pow(x,2)-2);
        }
        else {
            y = 420;
        }
        System.out.println(y);
    }
}

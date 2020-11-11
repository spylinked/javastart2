package Day_2;

import java.util.Scanner;

public class Floors {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int floors = 0;
        while (floors < 1) {
            System.out.println("Введите кол-во этажей > 0");
            while (!scan.hasNextInt()) {
                System.out.println("кол-во этажей должно быть числом!");
                scan.next();
            }
            floors = scan.nextInt();
        }
        if (floors < 5) {
            System.out.println("Малоэтажный дом");
        }
        else if (floors < 9) {
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }
    }
}

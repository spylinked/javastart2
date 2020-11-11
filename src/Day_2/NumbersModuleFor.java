package Day_2;

import java.util.Scanner;

public class NumbersModuleFor {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int firstInt = -1;
        int secondInt = -1;
        while (firstInt>=secondInt) {
            while (firstInt < 0) {
                System.out.println("Введите первое число >= 0");
                while (!scan.hasNextInt()) {
                    System.out.println("ЧИСЛО!");
                    scan.next();
                }
                firstInt = scan.nextInt();
            }
            while (secondInt < 0) {
                System.out.println("Введите второе число >= 0");
                while (!scan.hasNextInt()) {
                    System.out.println("ЧИСЛО!");
                    scan.next();
                }
                secondInt = scan.nextInt();
            }
            if (firstInt >= secondInt) {
                System.out.println("Второе число должно быть больше второго,введите числа повторно");
                firstInt = -1;
                secondInt = -1;
            }
        }
        System.out.println("Ввели: " + firstInt + " " +secondInt);
        for (int i = firstInt+1; i < secondInt; i++) {
            if(i%5 == 0 && i%10 != 0) {
                System.out.println(i);
            }
        }
    }
}

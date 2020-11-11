package Day_2;

import java.util.Scanner;

public class NumbersModuleWhile {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int firstInt = -1;
        int secondInt = -1;
        while (firstInt>=secondInt || firstInt < 0 || secondInt < 0) {
            System.out.println("Введите два числа через пробел");
            if (!scan.hasNextInt()) {
                System.out.println("Первое не число!");
                scan.next();
            }
            else {
                firstInt = scan.nextInt();
            }
            if (!scan.hasNextInt()) {
                System.out.println("Второе не число!");
                scan.next();
            } else {
                secondInt = scan.nextInt();
                if (firstInt >= secondInt) {
                    System.out.println("Второе число должно быть больше второго,введите числа повторно");
                    firstInt = -1;
                    secondInt = -1;
                }
            }
        }
        System.out.println("Ввели: " + firstInt + " " +secondInt);
        int i = firstInt+1;
        while (i < secondInt) {
            if(i%5 == 0 && i%10 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

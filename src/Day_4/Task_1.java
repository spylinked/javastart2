package Day_4;

import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int inInt;

        while (true) {
            //errMsg = "";
            System.out.println("Введите длинну массива");
            if (!scan.hasNextInt()) {
                System.out.println("Первое не число");
                scan.next();
            }
            else {
                inInt = scan.nextInt();
                break;
            }
        }
        System.out.println("Ввели:" + inInt);

        int[] arr = new int[inInt];
        int[] resArr = new int[5];
        for (int i=0; i<arr.length; i++) {
            arr[i] = rnd.nextInt(10);
        }
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Дина массива: " + arr.length);

        for (int x:arr) {
            if (x > 8) {
                resArr[0]++;
            }
            if (x == 1) {
                resArr[1]++;
            }
            if (x%2 == 0) {
                resArr[2]++;
            }
            if (x%2 != 0) {
                resArr[3]++;
            }
            resArr[4] = resArr[4] + x;
        }
        System.out.println("Количество чисел больше 8: " + resArr[0]);
        System.out.println("Количество чисел равных 1: " + resArr[1]);
        System.out.println("Количество четных чисел: " + resArr[2]);
        System.out.println("Количество нечетных чисел: " + resArr[3]);
        System.out.println("Сумма всех элементов массива: " + resArr[4]);
    }
}

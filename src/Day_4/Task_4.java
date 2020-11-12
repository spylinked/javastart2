package Day_4;

import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] arr = new int[100];
        int max3sum = 0;
        int maxSumI = 0;

        System.out.print("Массив: ");
        for (int i=0; i<arr.length; i++) {
            arr[i] = rnd.nextInt(10000);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length-2; i++) {
            int sum = arr[i] + arr[i + 1] + arr[i + 2];
            if (max3sum < sum) {
                max3sum = sum;
                maxSumI = i;
            }
        }
        System.out.println("Сумма: " + max3sum);
        System.out.println("Начиная с индекса: " + maxSumI);
    }
}

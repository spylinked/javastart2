package Day_4;

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] arr = new int[100];
        int[] resArr = new int[5];
        for (int i=0; i<arr.length; i++) {
            arr[i] = rnd.nextInt(10000);
        }
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        resArr[1] = arr[0];  //наименьший первый
        for (int x:arr) {
            if (resArr[0] < x) {            //Наибольший элемент массива
                resArr[0] = x;
            }
            if (resArr[1] > x) {            //Наименьший элемент массива
                resArr[1] = x;
            }
            if (x%10 == 0) {
                resArr[2]++;                //Количество элементов массива, оканчивающихся на 0
                resArr[3] = resArr[3]+x;    //Сумма элементов массива, оканчивающихся на 0
            }
        }
        System.out.println("Наибольший элемент массива: " + resArr[0]);
        System.out.println("Наименьший элемент массива: " + resArr[1]);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + resArr[2]);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + resArr[3]);
    }
}

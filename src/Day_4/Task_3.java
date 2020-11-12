package Day_4;

import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rowSum = 0;
        int maxRowSum = 0;
        int maxRow = 0;
        int[][] matrix = new int[12][8];
        for (int i=0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(50);
                rowSum = rowSum + matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            if (maxRowSum < rowSum) {
                maxRowSum = rowSum;
                maxRow = i;
            }
            rowSum = 0;
            System.out.println();
        }
        System.out.println("Индекс строки с максимальной суммой: " + maxRow + " Сумма: " + maxRowSum);
    }
}

package Day_16;

import Day_9.Task_2.Figure;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        fillFirstFile(1000);
        printResult(fillSecondFile(20));
    }

    public static void fillFirstFile(int genNum) throws FileNotFoundException {
        File file = new File("task16file1");
        PrintWriter pw = new PrintWriter(file);
        Random rnd = new Random();
        for (int i = 0; i < genNum; i++) {
            pw.print(rnd.nextInt(100) + " ");
        }
        pw.close();
        //return file;
    }

    public static File fillSecondFile(int every) throws FileNotFoundException {
        File file1 = new File("task16file1");
        File file2 = new File("task16file2");
        PrintWriter pw = new PrintWriter(file2);
        Scanner scanner = new Scanner(file1);
        String line = scanner.nextLine();
        String[] numbersLine = line.split(" ");
        int sum = 0;
        for (int i = 0; i < numbersLine.length; i++) {
            sum += Integer.parseInt(numbersLine[i]);
            if((i+1)%every == 0) {
                pw.print((float)sum/(float)every + " ");
                sum = 0;
            }
        }
        pw.close();
        return file2;
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersLine = line.split(" ");
        float sum = 0;
        for (String numberString: numbersLine) {
            sum += Float.parseFloat(numberString);
        }
        System.out.println((int)sum);
    }
}

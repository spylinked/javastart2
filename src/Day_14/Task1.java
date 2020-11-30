package Day_14;

import MyExceptions.BadIODataException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("digits");
        try {
            printSumDigits(file);
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (BadIODataException e) {
            System.out.println(e.getLocalizedMessage());
        }
        catch (NumberFormatException e) {
            System.out.println(e.getLocalizedMessage());
        }


    }
    public static void printSumDigits(File file) throws FileNotFoundException, BadIODataException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numberString = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String stringNumber : numberString) {
            try {
                numbers.add(Integer.parseInt(stringNumber));
            } catch(NumberFormatException e) {
                scanner.close();
                throw new NumberFormatException("Тут не число - " + stringNumber);
            }
        }
        if (numbers.size() != 10) {
            scanner.close();
            throw new BadIODataException("Количество чисел = " + numbers.size() + " а должно быть 10");
        }

        System.out.println(numbers);
        int summ = 0;
        for (Integer number : numbers) {
            summ = summ+number;
        }
        scanner.close();
        System.out.println(summ);
    }
}

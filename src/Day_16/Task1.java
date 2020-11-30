package Day_16;

import MyExceptions.BadIODataException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("digits");
        try {
            printResult(file);
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
    public static void printResult(File file) throws FileNotFoundException, BadIODataException {
        Scanner scanner = new Scanner(file);
        Pattern p = Pattern.compile("^(\\d+ )+(\\d+)$"); // пойдёт, среднее в одном числе всё равно не тсмысла искать
        int summ = 0;

        if(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Matcher m = p.matcher(line);
            if (!m.find()) {
                scanner.close();
                throw new BadIODataException("Не верный формат строки " + line);
            }
            String[] numberString = line.split(" ");
            for (String stringNumber : numberString) {
                summ = summ+Integer.parseInt(stringNumber);
            }
            double doub = (double)summ/numberString.length;

            scanner.close();
            System.out.println("Числа в файле: " + line);
            System.out.printf("Ответ: " + doub + " --> %.3f\n",  doub);
        }

    }
}

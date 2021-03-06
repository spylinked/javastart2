package Day_14.Task_3;

import MyExceptions.BadIODataException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("persons");

        try {
            System.out.println(parseFileToObjList(file));
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

    public static List<People> parseFileToObjList(File file) throws FileNotFoundException, BadIODataException {
        Scanner scanner = new Scanner(file);
        List<Integer> numbers = new ArrayList<>();

        Pattern p = Pattern.compile("\\S+ \\d+");

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Matcher m = p.matcher(line);
            if (!m.find()) {
                scanner.close();
                throw new BadIODataException("Не верный формат строки " + line);
            }
            String[] personString = line.split(" ");
            if (Integer.parseInt(personString[1]) < 0 ) {
                scanner.close();
                throw new BadIODataException("Обнаружен возраст < 0 у " + personString[0]);
            }
            new People(personString[0], Integer.parseInt(personString[1]));
        }
        scanner.close();
        return People.getAllPeoples();
    }
}

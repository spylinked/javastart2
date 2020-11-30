package Day_15;

import MyExceptions.BadIODataException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        File inFile = new File("src/shoes.csv");

        try {
            getMissingShoes(inFile);
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

    public static void getMissingShoes(File file) throws FileNotFoundException, BadIODataException {
        File outFile = new File("outShoes");
        PrintWriter pw = new PrintWriter(outFile);
        Scanner scanner = new Scanner(file);
        List<Integer> numbers = new ArrayList<>();

        Pattern p = Pattern.compile("^[^;]+;\\d+;\\d+$");

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Matcher m = p.matcher(line);
            if (!m.find()) {
                scanner.close();
                throw new BadIODataException("Не верный формат строки " + line);
            }
            String[] shoesLine = line.split(";");
            if (Integer.parseInt(shoesLine[2]) == 0 ) {
                pw.println(shoesLine[0] + ", " + shoesLine[1] + ", " + shoesLine[2]);
            }
        }
        pw.close();
        scanner.close();

    }
}

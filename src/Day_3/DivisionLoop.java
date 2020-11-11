package Day_3;

import java.util.Scanner;

public class DivisionLoop {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        var errMsg = "";
        double firstDoub = 0;
        double secondDoub = 0;
        while (true) {
            errMsg = "";
            System.out.println("Введите два числа через пробел");
            if (!scan.hasNextDouble()) {
                errMsg = errMsg + "Первое не число!\n";
                scan.next();
            }
            else {
                firstDoub = scan.nextDouble();
            }
            if (!scan.hasNextDouble()) {
                errMsg = errMsg + "Второе не число!\n";
                scan.next();
            } else {
                secondDoub = scan.nextDouble();
            }
            if (!errMsg.isEmpty()) {
                System.out.println(errMsg);
            } else {
                if (secondDoub == 0) {
                    System.out.println("Вы схлопнули вселенную, прощайте...");
                    break;
                }
                else {
                    System.out.println(firstDoub/secondDoub);
                }
            }
        }

    }
}

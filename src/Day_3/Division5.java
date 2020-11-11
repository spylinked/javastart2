package Day_3;

import java.util.Scanner;

public class Division5 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        var errMsg = "";
        double firstDoub = 0;
        double secondDoub = 0;
        for (int i = 0; i < 5; i++) {
            errMsg = "";
            System.out.println("Введите два числа через пробел " + (i+1) +"/5");
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
                    System.out.println("Вы схлопнули вселенную... но попробуйте еще раз");
                }
                else {
                    System.out.println(firstDoub/secondDoub);
                }
            }
        }

    }
}

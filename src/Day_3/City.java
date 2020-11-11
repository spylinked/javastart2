package Day_3;

import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите город");

        boolean stpFlg = false;

        while(!stpFlg){
            switch(scan.next()) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                case "stop":
                    stpFlg = true;
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }

    }
}

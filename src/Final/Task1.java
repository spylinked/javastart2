package Final;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 или 2 игрока?");
        while(true) {
            switch(scan.nextInt()) {
                case 1:
                    startGameBot();
                    break;
                case 2:
                    startGame();
                    break;
                default:
            }
        }
    }

    public static void startGame() {
        Scanner scan = new Scanner(System.in);
        List<Player> playersList = new ArrayList<>();
        System.out.println("Игрок 1 введите ваше имя: ");
        playersList.add(new Player(scan.nextLine()));
        playersList.get(0).placeShips();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Игрок 2 введите ваше имя: ");
        playersList.add(new Player(scan.nextLine()));
        playersList.get(1).placeShips();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        Collections.shuffle(playersList);
        System.out.println("Первым ходит " + playersList.get(0).getName() + "! Введите в консоль что угодно, для начала хода");
        scan.nextLine();

        int status = 0;
        while (status != 2) {
            status = 1;
            while(status == 1) {
                status = playersList.get(0).shoot(playersList.get(1));
            }
            if(status != 2) {
                Collections.swap(playersList, 0, 1);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Ход игрока " + playersList.get(0).getName() + " Введите что угодно в консль для начала хода");
                scan.nextLine();
                System.out.println("Ваше поле:");
                playersList.get(0).getField().printMyField();
            }
        }

    }
    public static void startGameBot(){
        Scanner scan = new Scanner(System.in);
        List<Player> playersList = new ArrayList<>();
        playersList.add(new Bot());
        playersList.get(0).placeShips();
        System.out.println("Игрок 1 введите ваше имя: ");
        playersList.add(new Player(scan.nextLine()));
        playersList.get(1).placeShips();
        Collections.shuffle(playersList);
        System.out.println("Первым ходит " + playersList.get(0).getName());
        int status = 0;
        while (status != 2) {
            status = 1;
            while(status == 1) {
                status = playersList.get(0).shoot(playersList.get(1));
            }
            if(status != 2) {
                Collections.swap(playersList, 0, 1);
                System.out.println("Ход игрока " + playersList.get(0).getName());
                System.out.println("Ваше поле:");
                playersList.get(0).getField().printMyField();
            }
        }
    }
}

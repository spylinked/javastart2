package Final;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        startGame();
        /*
        BattleField field = new BattleField();
        field.printField();

        for (Ship ship : field.getShipsList()) {
            ship.placeShip();
            field.printField();
        }

         */


        /*
        field.printField();
        field.place(9,9);
        System.out.println();
        field.printField();
        field.place(4,5);
        System.out.println();
        field.printField();

         */
    }

    public static void startGame() throws IOException {
        List<Player> playersList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Игрок 1 введите ваше имя: ");
        playersList.add(new Player(scan.nextLine()));
        playersList.get(0).placeShips();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Игрок 2 введите ваше имя: ");
        playersList.add(new Player(scan.nextLine()));
        playersList.get(1).placeShips();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
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
}

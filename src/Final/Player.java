package Final;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player {
    private final String name;
    private final BattleField field;

    public Player(String name) {
        this.name = name;
        field = new BattleField();
    }

    public String getName() {
        return name;
    }

    public BattleField getField() {
        return field;
    }

    public void placeShips() {
        field.printMyField();
        System.out.println(name + " расположите ваши корабли");
        for (Ship ship : field.getShipsList()) {
            ship.placeShip();
            field.printMyField();
        }
    }
    public int shoot (Player player) {
        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^([A-J]([1-9]|10))$");
        int status;
        while (true){
            player.getField().printEnemyField();
            System.out.println("Стреляйте!");
            String line = scan.nextLine();
            Matcher m = pattern.matcher(line);
            if (!m.find()) {
                System.out.println("Не правильная координата");
                continue;
            }
            status = player.getField().shoot(Integer.parseInt(line.replaceAll("[\\D]", ""))-1, utils.transCharToInt(line.charAt(0)));
            if (status == 0 || status == 2){
                break;
            }
        }
        return status;
    }
}

package Final;

import MyExceptions.BadIODataException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Ship {
    private final ShipType type;
    private boolean placed;
    private final BattleField field;

    public Ship(ShipType type, BattleField field) {
        this.type = type;
        this.field = field;
        this.placed = false;
    }

    public boolean isPlaced() {
        return placed;
    }
    public int getSize() {
        return type.getSize();
    }

    public void setPlaced(boolean placed) {
        this.placed = placed;
    }

    public void placeShip() {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Расположите " + type.getSize() + "-х палубный корабль: ");
            String line = scan.nextLine();
            Matcher m = type.getPattern().matcher(line);
            String[] cells = line.split(";");
            boolean isError = false;
            if (m.find()) {
                int[][] shipPos = new int[cells.length][2];
                boolean horizontal = true;
                boolean vertical = true;
                boolean badShip = false;
                boolean occupied = false;
                for (int i = 0; i < cells.length; i++) {
                    shipPos[i][0] = Integer.parseInt(cells[i].replaceAll("[\\D]", ""))-1;
                    shipPos[i][1] = utils.transCharToInt(cells[i].charAt(0));
                    if(!field.getCellGrid()[shipPos[i][0]][shipPos[i][1]].checkPlace()) {
                        System.out.println("Невозможно расположить на " + cells[i] + " рядом другой корабль");
                        occupied = true;
                        break;
                    }
                }
                if(occupied){
                    continue;
                }
                for (int i = 1; i < shipPos.length; i++) {
                    if(shipPos[i][0]!=shipPos[i-1][0]) {
                        horizontal = false;
                    }
                    if(shipPos[i][1]!=shipPos[i-1][1]) {
                        vertical = false;
                    }
                }
                if (!horizontal && !vertical) {
                    System.out.println("Корабль должен распологаться вертикально или горизонтально.");
                    continue;
                }
                if (vertical){
                    Arrays.sort(shipPos, Comparator.comparingInt(o -> o[0]));
                    for (int i = 1; i < shipPos.length; i++) {
                        if (shipPos[i-1][0]+1 != shipPos[i][0]) {
                            badShip = true;
                            break;
                        }
                    }
                }
                if (horizontal && !badShip){
                    Arrays.sort(shipPos, Comparator.comparingInt(o -> o[1]));
                    for (int i = 1; i < shipPos.length; i++) {
                        if (shipPos[i-1][1]+1 != shipPos[i][1]) {
                            badShip = true;
                            break;
                        }
                    }
                }
                if(badShip){
                    System.out.println("Клетки корабля не соединены или несколько одинаковых клеток.");
                    continue;
                }



                /*
                for (int i = 0; i < cells.length; i++) {
                    for (int j = i+1; j < cells.length; j++) {
                        if(cells[i].equals(cells[j])) {
                            System.out.println("Найдены 2 одинаковые клетки " + cells[i] + " " + cells[j]);
                            isError = true;
                            break;
                        }
                    }
                }
                for (int i = 0; i < cells.length; i++) {
                    int posX = Integer.parseInt(cells[i].replaceAll("[\\D]", ""))-1;
                    int posY = utils.transCharToInt(cells[i].charAt(0));
                    if(!field.getCellGrid()[posX][posY].checkPlace()) {
                        System.out.println("Невозможно расположить на " + cells[i] + " рядом другой корабль");
                        isError = true;
                        break;
                    }
                    if(i>0){
                        int prevPosX = Integer.parseInt(cells[i-1].replaceAll("[\\D]", ""))-1;
                        int PrevPosY = utils.transCharToInt(cells[i-1].charAt(0));
                        //if(prevPosX != posX+1 || prevPosX != posX-1 || PrevPosY != posY+1 || PrevPosY != posY-1) {
                        /*
                        if(prevPosX == posX) {
                            System.out.println("Разрыв в координатах");
                            isError = true;
                            break;
                        }

                    }
                }
                */
            } else {
                System.out.println("Не правильный формат строки: " + line);
                continue;
            }
            for (int i = 0; i < cells.length; i++) {
                int posX = Integer.parseInt(cells[i].replaceAll("[\\D]", ""))-1;
                int posY = utils.transCharToInt(cells[i].charAt(0));
                field.getCellGrid()[posX][posY].setContainShip(true);

            }
            break;

        }



    }
}

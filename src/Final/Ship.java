package Final;

import MyExceptions.BadIODataException;

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
                        */
                    }
                }
            } else {
                System.out.println("Не правильный формат строки: " + line);
                isError = true;
            }
            if(!isError) {
                for (int i = 0; i < cells.length; i++) {
                    int posX = Integer.parseInt(cells[i].replaceAll("[\\D]", ""))-1;
                    int posY = utils.transCharToInt(cells[i].charAt(0));
                    field.getCellGrid()[posX][posY].setContainShip(true);

                }
                break;
            }

        }



    }
}

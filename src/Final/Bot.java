package Final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bot extends Player{
    public Bot() {
        super("BOT");
    }
    public void placeShips() {
        List<Cell> freeCells = new ArrayList<Cell>();
        List<Cell> occupiedCells = new ArrayList<Cell>();
        for (Ship ship : super.getField().getShipsList()) {
            freeCells.clear();
            occupiedCells.clear();
            for (int i = 0; i < super.getField().getCellGrid().length; i++) {
                for (int j = 0; j < super.getField().getCellGrid()[i].length; j++) {
                    if (super.getField().getCellGrid()[i][j].isContainShip()) {
                        occupiedCells.add(super.getField().getCellGrid()[i][j]);
                        for (Cell neiCell: super.getField().getCellGrid()[i][j].getNeighbours()) {
                            if(!neiCell.isContainShip()){
                                occupiedCells.add(neiCell);
                            }
                        }
                    }
                    freeCells.add(super.getField().getCellGrid()[i][j]);
                }
            }
            freeCells.removeAll(occupiedCells);
            Collections.shuffle(freeCells);
            for (int i = 0; i < freeCells.size(); i++) {
                int posX = freeCells.get(i).getPosX();
                int posY = freeCells.get(i).getPosY();
                boolean down = true;
                for (int j = 0; j < ship.getSize()-1; j++) { //down
                    if(!freeCells.contains(super.getField().getCellGrid()[posX][posY-1]))
                        down = false;
                        break;

                }
            }
        }
    }
}

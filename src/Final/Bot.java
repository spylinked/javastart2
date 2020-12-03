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
                List<Integer> dirList = new ArrayList<>();
                if (freeCells.get(i).canPlace(ship.getSize(),0)) //UP
                    dirList.add(0);
                if (freeCells.get(i).canPlace(ship.getSize(),1)) //RIGHT
                    dirList.add(1);
                if (freeCells.get(i).canPlace(ship.getSize(),2)) //DOWN
                    dirList.add(2);
                if (freeCells.get(i).canPlace(ship.getSize(),3)) //LEFT
                    dirList.add(3);
                if(dirList.size() > 0){
                    int[][] shipPos = new int[ship.getSize()][2];
                    Collections.shuffle(dirList);
                    for (int j = 0; j < ship.getSize(); j++) {
                        if(dirList.get(0)==0) {
                            shipPos[j][0] = freeCells.get(i).getPosX();
                            shipPos[j][1] = freeCells.get(i).getPosY()-j;
                        }
                        if(dirList.get(0)==1) {
                            shipPos[j][0] = freeCells.get(i).getPosX()+j;
                            shipPos[j][1] = freeCells.get(i).getPosY();
                        }
                        if(dirList.get(0)==2) {
                            shipPos[j][0] = freeCells.get(i).getPosX();
                            shipPos[j][1] = freeCells.get(i).getPosY()+j;
                        }
                        if(dirList.get(0)==3) {
                            shipPos[j][0] = freeCells.get(i).getPosX()-j;
                            shipPos[j][1] = freeCells.get(i).getPosY();
                        }
                    }
                    ship.setShipCells(shipPos);
                    break;
                }
            }
        }
    }
}

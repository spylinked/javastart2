package Final;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private boolean shot = false;
    private boolean containShip = false;
    private final BattleField field;
    private final int posX;
    private final int posY;
    private Ship ship;
    private final List<Cell> neighbours = new ArrayList<Cell>();

    public Cell(BattleField field, int posX, int posY) {
        this.field = field;
        this.posX = posX;
        this.posY = posY;

    }

    public boolean isShot() {
        return shot;
    }

    public void setShot(boolean shot) {
        this.shot = shot;
    }

    public Ship getShip() {
        return this.ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public boolean isContainShip() {
        if(ship!=null){
            return true;
        }
        return false;
    }

    public List<Cell> getNeighbours() {
        return neighbours;
    }

    public boolean checkPlace(){
        if (this.isContainShip())
            return false;
        for (Cell neighbourCell: neighbours) {
            if(neighbourCell.isContainShip())
                return false;
        }
        return true;
    }

    public void fillNeighbours(){
        if(posX>0) {
            this.field.getCellGrid()[posX - 1][posY].getNeighbours().add(this);
            if(posY>0)
                this.field.getCellGrid()[posX - 1][posY - 1].getNeighbours().add(this);
            if(posY<9)
                this.field.getCellGrid()[posX - 1][posY + 1].getNeighbours().add(this);
        }
        if(posX<9) {
            this.field.getCellGrid()[posX+1][posY].getNeighbours().add(this);
            if(posY>0)
                this.field.getCellGrid()[posX+1][posY-1].getNeighbours().add(this);
            if(posY<9)
                this.field.getCellGrid()[posX+1][posY+1].getNeighbours().add(this);

        }
        if(posY>0) {
            this.field.getCellGrid()[posX][posY - 1].getNeighbours().add(this);
        }
        if(posY<9) {
            this.field.getCellGrid()[posX][posY + 1].getNeighbours().add(this);
        }
    }




}

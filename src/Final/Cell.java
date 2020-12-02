package Final;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private boolean revealed = false;
    private boolean containShip = false;
    private final BattleField field;
    private final int posX;
    private final int posY;
    private final List<Cell> neighbours = new ArrayList();

    public Cell(BattleField field, int posX, int posY) {
        this.field = field;
        this.posX = posX;
        this.posY = posY;

    }

    public boolean isRevealed() {
        return revealed;
    }

    public void setRevealed(boolean revealed) {
        this.revealed = revealed;
    }

    public boolean isContainShip() {
        return containShip;
    }

    public void setContainShip(boolean containShip) {
        this.containShip = containShip;
    }

    public List getNeighbours() {
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

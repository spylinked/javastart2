package Final;

import java.util.ArrayList;
import java.util.List;

public class BattleField {
    private Cell[][] cellGrid = new Cell[10][10];
    private List<Ship> shipsList= new ArrayList<Ship>();

    public BattleField() {
        for (int i = 0; i < cellGrid.length; i++) {
            for (int j = 0; j < cellGrid[i].length; j++) {
                cellGrid[i][j] = new Cell(this,i,j);
            }
        }
        for(Cell[] cellsX: cellGrid)
        {
            for(Cell cell: cellsX)
                cell.fillNeighbours();
        }

        for (ShipType shipType: ShipType.values()) {
            for (int i = 0; i < shipType.getNeedCount(); i++) {
                shipsList.add(new Ship(shipType, this));
            }
        }
    }

    public Cell[][] getCellGrid() {
        return cellGrid;
    }

    public List<Ship> getShipsList() {
        return shipsList;
    }

    public void place(int X, int Y){
        if(cellGrid[Y][X].checkPlace()){
            cellGrid[Y][X].setContainShip(true);
        } else {
            System.out.println("Нельзя поставить");
        }
    }

    public void printField(){
        System.out.println("    A B C D E F G H I J ");
        for (int i = 0; i < cellGrid.length; i++) {
            for (int j = 0; j < cellGrid[i].length; j++) {
                if(j==0)
                    System.out.printf("%2d ",i+1);
                if(cellGrid[i][j].isContainShip()) {
                    System.out.print("|■");
                } else {
                    System.out.print("|_");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }
}

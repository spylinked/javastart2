package Final;

public class Task1 {
    public static void main(String[] args) {
        BattleField field = new BattleField();
        field.printField();

        for (Ship ship : field.getShipsList()) {
            ship.placeShip();
            field.printField();
        }


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
}

package Day_17;

public class ChessBoard {
    private ChessPiece[][] chessPositions;

    public ChessBoard(ChessPiece[][] chessPositions) {
        this.chessPositions = chessPositions;
    }

    public void print(){
        for (int i = 0; i < chessPositions.length; i++) {
            for (int j = 0; j < chessPositions[i].length; j++) {
                System.out.print(chessPositions[i][j].getIcon());
            }
            System.out.println();
        }
    }
}

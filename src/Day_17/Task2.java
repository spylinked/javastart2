package Day_17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] chessPositions = new ChessPiece[8][8];
        for (int i = 0; i < chessPositions.length; i++) {
            for (int j = 0; j < chessPositions[i].length; j++) {
                chessPositions[i][j] = ChessPiece.EMPTY;
            }
        }
        chessPositions[0][0] = ChessPiece.ROOK_BLACK;
        chessPositions[0][5] = ChessPiece.ROOK_BLACK;
        chessPositions[0][6] = ChessPiece.KING_BLACK;
        chessPositions[1][1] = ChessPiece.ROOK_WHITE;
        chessPositions[1][4] = ChessPiece.PAWN_BLACK;
        chessPositions[1][5] = ChessPiece.PAWN_BLACK;
        chessPositions[1][7] = ChessPiece.PAWN_BLACK;
        chessPositions[2][0] = ChessPiece.PAWN_BLACK;
        chessPositions[2][2] = ChessPiece.KNIGHT_BLACK;
        chessPositions[2][6] = ChessPiece.PAWN_BLACK;
        chessPositions[3][0] = ChessPiece.QUEEN_BLACK;
        chessPositions[3][3] = ChessPiece.BISHOP_WHITE;
        chessPositions[4][3] = ChessPiece.BISHOP_BLACK;
        chessPositions[4][4] = ChessPiece.PAWN_WHITE;
        chessPositions[5][4] = ChessPiece.BISHOP_WHITE;
        chessPositions[5][5] = ChessPiece.PAWN_WHITE;
        chessPositions[6][0] = ChessPiece.PAWN_WHITE;
        chessPositions[6][3] = ChessPiece.QUEEN_WHITE;
        chessPositions[6][5] = ChessPiece.PAWN_WHITE;
        chessPositions[6][7] = ChessPiece.PAWN_WHITE;
        chessPositions[7][5] = ChessPiece.ROOK_WHITE;
        chessPositions[7][6] = ChessPiece.KING_WHITE;

        ChessBoard chessBoard = new ChessBoard(chessPositions);
        chessBoard.print();
    }
}

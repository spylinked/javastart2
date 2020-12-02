package Day_17;

public enum ChessPiece {
    KING_WHITE("Король", 100, "♔", "Белый"),
    KING_BLACK("Король", 100, "♚", "Черный"),
    QUEEN_WHITE("Ферзь", 9, "♕", "Белый"),
    QUEEN_BLACK("Ферзь", 9, "♛", "Черный"),
    ROOK_WHITE("Ладья", 5, "♖", "Белая"),
    ROOK_BLACK("Ладья", 5, "♜", "Черная"),
    BISHOP_WHITE("Слон", 3.5f,"♗", "Белый"),
    BISHOP_BLACK("Слон", 3.5f, "♝", "Черный"),
    KNIGHT_WHITE("Конь", 3, "♘", "Белый"),
    KNIGHT_BLACK("Конь", 3,"♞", "Черный"),
    PAWN_WHITE("Пешка", 1, "♙", "Белая"),
    PAWN_BLACK("Пешка", 1, "♟", "Черная"),
    EMPTY("_",-1, "_", "_");

    private String translation;
    private float value;
    private String icon;
    private String color;

    ChessPiece(String translation, float value, String icon, String color) {
        this.translation = translation;
        this.value = value;
        this.icon = icon;
        this.color = color;
    }

    public String getIcon() {
        return icon;
    }
}

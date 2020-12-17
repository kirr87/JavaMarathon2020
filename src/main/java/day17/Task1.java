package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece chessPieceWhite = ChessPiece.PAWN_WHITE;
        ChessPiece chessPieceBlack = ChessPiece.ROOK_BLACK;
        ChessPiece[] array = new ChessPiece[8];

        for (int i = 0; i < 8; i++) {
            if (i < 4) {
                array[i] = chessPieceWhite;
            } else {
                array[i] = chessPieceBlack;
            }
            System.out.print(array[i].getView() + " ");
        }
    }
}
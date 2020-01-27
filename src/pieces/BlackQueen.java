package pieces;

import config.PieceColor;
import pieces.Piece;
import pieces.Queen;

public class BlackQueen extends Queen {
    public BlackQueen(String color, int row, int col){
        super(PieceColor.BLACK, row, col);
    }

    public boolean isMovePossible (int moveRow, int moveCol) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if(color == PieceColor.BLACK) {
                    if ((moveRow == (this.row + i)) && (moveCol == this.col)) {
                        return true;
                    }
                    if ((moveRow == (this.row - i)) && (moveCol == this.col)) {
                        return true;
                    }
                    if ((moveRow == (this.row + i)) && (moveCol == (this.col + j))) {
                        return true;
                    }
                    if ((moveRow == (this.row - i)) && (moveCol == (this.col - j))) {
                        return true;
                    }
                    if ((moveRow == (this.row - i)) && (moveCol == (this.col + j))) {
                        return true;
                    }
                    if ((moveRow == (this.row + i)) && (moveCol == (this.col - j))) {
                        return true;
                    }
                    if ((moveRow == this.row) && (moveCol == (this.col + j))) {
                        return true;
                    }
                    if ((moveRow == this.row) && (moveCol == (this.col - j))) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return false;

    }

    @Override
    public void move(int moveRow, int moveCol) {
        if(this.isMovePossible(moveRow, moveCol)) {

            this.row = moveRow;
            this.col = moveCol;
        }
        // TODO Auto-generated method stub
    }
}

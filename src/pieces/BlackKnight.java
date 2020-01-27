package pieces;

import config.PieceColor;
import pieces.Knight;

public class BlackKnight extends Knight {
    public BlackKnight (String color, int row, int col) {
        super(PieceColor.BLACK, row,col);
    }

    public boolean isMovePossible(int moveRow, int moveCol) {

        for(int i = 0; i < 10; i++){

            for(int j = 0; j < 10; j++){
                if(color == PieceColor.BLACK) {

                    if ((moveRow == this.row + i + 3) && (moveCol == this.col + j + 1)) {
                        return true;
                    }
                    if ((moveRow == this.row + i + 1) && (moveCol == this.col + j + 3)) {
                        return true;
                    }
                    if ((moveRow == this.row + i - 1) && (moveCol == this.col + j + 3)) {
                        return true;
                    }
                    if ((moveRow == this.row + i - 3) && (moveCol == this.col + j + 1)) {
                        return true;
                    }
                    if ((moveRow == this.row + i - 3) && (moveCol == this.col + j - 1)) {
                        return true;
                    }
                    if ((moveRow == this.row + i - 1) && (moveCol == this.col + j - 3)) {
                        return true;
                    }
                    if ((moveRow == this.row + i + 1) && (moveCol == this.col + j - 3)) {
                        return true;
                    }
                    if ((moveRow == this.row + i + 3) && (moveCol == this.col + j - 1)) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        } return false;

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

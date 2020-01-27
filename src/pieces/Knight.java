package pieces;

public class Knight extends Piece {
    public Knight(String color, int row, int col) {

        super(color, row, col);
        this.power 	= 5;
        this.id 	= 4;
    }

    public boolean isMovePossible(int moveRow, int moveCol) {

        for(int i = 0; i < 10; i++){

            for(int j = 0; j < 10; j++){

                if((moveRow == this.row + i + 3) && (moveCol == this.col + j + 1)){
                    return true;
                }
                if((moveRow == this.row + i + 1) && (moveCol == this.col + j + 3)){
                    return true;
                }
                if((moveRow == this.row + i - 1) && (moveCol == this.col + j + 3)){
                    return true;
                }
                if ((moveRow == this.row + i - 3) && (moveCol == this.col + j + 1)){
                    return true;
                }
                if ((moveRow == this.row + i - 3) && (moveCol == this.col + j - 1)){
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
        } return false;

    }

    @Override
    public void move(int moveRow, int moveCol) {
        if (this.isMovePossible(moveRow, moveCol)) {
            this.row = moveRow;
            this.col = moveCol;
        }
        // TODO Auto-generated method stub
    }

    @Override
    public void attack(int attackRow, int attackCol) {
        // TODO Auto-generated method stub

    }
}

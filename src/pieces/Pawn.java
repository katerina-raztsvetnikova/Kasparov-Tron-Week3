package pieces;

public class Pawn extends Piece {
    public Pawn(String inputColor, int row, int col) {

        super(inputColor, row, col);
        this.power 	= 1;
        this.id 	= 1;
    }


    public boolean isMovePosible(int moveRow, int moveCol) {

        int moveRowCoeficient = (this.row - moveRow);
        int moveColCoeficient = (this.col - moveCol);

        boolean isRowMovementPosible = (moveRowCoeficient == 1);
        boolean isColMovementPosible = (moveColCoeficient == 0);

        return isRowMovementPosible &&
                isColMovementPosible;
    }

    public void move(int moveRow, int moveCol) {

        if(this.isMovePosible(moveRow, moveCol)) {

            this.row = moveRow;
            this.col = moveCol;
        }

    }

    public void attack(int attackRow, int attackCol) {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {

                if ((attackRow == (this.row + i)) && (attackCol == (this.col + j))) {
                    System.out.println("It's pawn attack.");
                }
                if ((attackRow == (this.row - i)) && (attackCol == (this.col + j))) {
                    System.out.println("It's pawn attack.");
                }
                if ((attackRow == (this.row - i)) && (attackCol == (this.col - j))) {
                    System.out.println("It's pawn attack.");
                }
                if ((attackRow == (this.row + i)) && (attackCol == (this.col - j))) {
                    System.out.println("It's pawn attack.");
                } else {
                    System.out.println("Invalid attack.");
                }
            }
        }

    }
}




import pieces.*;

import java.util.Scanner;


import static config.PieceColor.BLACK;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input start position of row:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Input start position of col:");
        int col = Integer.parseInt(scanner.nextLine());


        System.out.println("Input position when move row:");
        int moveRow = Integer.parseInt(scanner.nextLine());
        System.out.println("Input position when move col:");
        int moveCol = Integer.parseInt(scanner.nextLine());

        System.out.println("Input BLACK or WHITE pieces are on the move:");
        String color = scanner.nextLine();



        Pawn pawn = new Pawn(color,row,col);
        Chudaka chudaka = new Chudaka(BLACK,0,0);
        Bishop bishop = new Bishop(color, row,col);
        King king = new King(color, row, col);
        Queen queen = new Queen(color, row, col);
        Knight knight = new Knight(color, row, col);
        Rook rook = new Rook(color, row, col);





        if(pawn instanceof Pawn) {
            System.out.println("Yes");
        }

        if(pawn instanceof Piece) {
            System.out.println("Yes");
        }

        if(pawn instanceof Object) {
            System.out.println("Yes");
        }

        if(chudaka instanceof CanBlast) {
            System.out.println("Yes");
        }

        System.out.println(bishop.isMovePossible(moveRow,moveCol));
        System.out.println(king.isMovePossible(moveRow,moveCol));
        System.out.println(queen.isMovePossible(moveRow,moveCol));
        System.out.println(knight.isMovePossible(moveRow,moveCol));
        System.out.println(rook.isMovePossible(moveRow,moveCol));

    }




    }









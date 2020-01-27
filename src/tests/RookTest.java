package tests;

import config.PieceColor;
import pieces.Rook;

public class RookTest {

    public static void testIfTheMoveMethodPositionTheRookCorrectlyVertical(){

        System.out.print("testIfTheMoveMethodPositionTheRookCorrectlyVertical  - ");

        Rook testRook = new Rook(PieceColor.BLACK, 0, 0);

        boolean isValid = testRook.isMovePossible(1,0);
        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void testIfTheMoveMethodPositionTheRookCorrectlyHorizontal(){

        System.out.print("testIfTheMoveMethodPositionTheRookCorrectlyHorizontal  - ");

        Rook testRook = new Rook (PieceColor.BLACK, 0, 0);

        boolean isValid = testRook.isMovePossible(0,1);
        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void testIfTheRookMoveIsNotPossible(){

        System.out.print("testIfTheRookMoveIsNotPossible  - ");

        Rook testRook = new Rook (PieceColor.BLACK, 0, 0);

        boolean isValid = (testRook.isMovePossible(1,1) == false);
        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }


    public static  void run (){

        testIfTheMoveMethodPositionTheRookCorrectlyVertical();
        testIfTheMoveMethodPositionTheRookCorrectlyHorizontal();
        testIfTheRookMoveIsNotPossible();


    }
}

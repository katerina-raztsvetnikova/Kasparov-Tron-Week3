package tests;

import config.PieceColor;
import pieces.Queen;

public class QueenTest {
    public static void testIfTheMoveMethodPositionTheQueenCorrectly() {

        System.out.print("testIfTheMoveMethodPositionTheQueenCorrectly  - ");

        Queen testQueen = new Queen(PieceColor.BLACK, 4, 4);

        boolean isValid = testQueen.isMovePossible(3, 5);
        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void ifQueenMoveIsNotPossible() {

        System.out.print("ifQueenMoveIsNotPossible - ");

        Queen testQueen = new Queen(PieceColor.BLACK, 4, 4);

        boolean isValid = (testQueen.isMovePossible(2, 5)== false);
        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }
    public static void run() {

        testIfTheMoveMethodPositionTheQueenCorrectly();
        ifQueenMoveIsNotPossible();

    }
}

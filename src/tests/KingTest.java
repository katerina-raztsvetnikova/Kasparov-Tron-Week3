package tests;

import config.PieceColor;
import pieces.King;

public class KingTest {
    public static void testIfTheMoveMethodPositionTheKingCorrectlyOneSquareForwardHorizontal() {

        System.out.print("testIfTheMoveMethodPositionTheKingCorrectlyOneSquareForwardHorizontal  - ");

        King testKing = new King(PieceColor.BLACK, 6, 5);

        boolean isValid = testKing.isMovePossible(6, 6);
        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void testIfTheMoveMethodPositionTheKingCorrectlyOneSquareForwardVertical() {

        System.out.print("testIfTheMoveMethodPositionTheKingCorrectlyOneSquareForwardHorizontalVertical  - ");

        King testKing = new King(PieceColor.BLACK, 6, 5);

        boolean isValid = testKing.isMovePossible(5, 5);
        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }


    public static void testIfTheMoveMethodPositionTheKingCorrectlyOneSquareForwardDiagonally() {

        System.out.print("testIfTheMoveMethodPositionTheKingCorrectlyOneSquareForwardDiagonally  - ");

        King testKing = new King(PieceColor.BLACK, 6, 5);

        boolean isValid = testKing.isMovePossible(5, 4);
        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }
    public static void testIfKingMoveIsNotPossible() {

        System.out.print("testIfKingMoveIsNotPossible - ");

        King testKing = new King(PieceColor.BLACK, 1, 2);

        boolean isValid = (testKing.isMovePossible(3, 2) == false);
        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void run() {

        testIfTheMoveMethodPositionTheKingCorrectlyOneSquareForwardHorizontal();
        testIfTheMoveMethodPositionTheKingCorrectlyOneSquareForwardVertical();
        testIfTheMoveMethodPositionTheKingCorrectlyOneSquareForwardDiagonally();
        testIfKingMoveIsNotPossible();

    }
}
package tests;

import config.PieceColor;
import pieces.Knight;

public class KnightTest {

    public static void testIfTheMoveMethodPositionTheKnightCorrectlyVertical() {

        System.out.print("testIfTheMoveMethodPositionTheKnightCorrectlyVertical  - ");

        Knight testKnight = new Knight(PieceColor.BLACK, 6, 6);

        boolean isValid = testKnight.isMovePossible(3, 5);
        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void testIfTheMoveMethodPositionTheKnightCorrectlyHorizontal() {

        System.out.print("testIfTheMoveMethodPositionTheKnightCorrectlyHorizontal  - ");

        Knight testKnight = new Knight(PieceColor.BLACK, 6, 6);

        boolean isValid = testKnight.isMovePossible(7, 9);
        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void testIfKnightMoveIsNotPossible() {

        System.out.print("testIfKnightMoveIsNotPossible  - ");

        Knight testKnight = new Knight (PieceColor.BLACK, 6, 6);

        boolean isValid = (testKnight.isMovePossible(4, 5)== false);
        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);


    }
    public static  void run () {
        testIfTheMoveMethodPositionTheKnightCorrectlyVertical();
        testIfTheMoveMethodPositionTheKnightCorrectlyHorizontal();
        testIfKnightMoveIsNotPossible();
    }

}

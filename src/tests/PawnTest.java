package tests;

import config.PieceColor;
import pieces.Pawn;

public class PawnTest {
    public static void testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward() {

        System.out.print("testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward  - ");

        Pawn testPawn = new Pawn(PieceColor.BLACK, 8, 0);

        boolean isValid = testPawn.isMovePosible(7, 0);
        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void testIfMoveOverTwoSquereIsNotPosible() {

        System.out.print("testIfMoveOverTwoSquereIsNotPosible  - ");

        Pawn testPawn = new Pawn(PieceColor.BLACK, 8, 0);

        boolean isValid = (testPawn.isMovePosible(6, 0) == false);
        String testMessage = (isValid) ? "Valid" : "Fail";
        System.out.println(testMessage);
    }

    public static void run() {

        testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward();
        testIfMoveOverTwoSquereIsNotPosible();
    }
}

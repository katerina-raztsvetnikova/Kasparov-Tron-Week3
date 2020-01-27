package tests;

import config.PieceColor;
import pieces.Bishop;

public class BishopTest {

        public static void testIfTheMoveMethodPositionTheBishopCorrectlyDiagonally() {

            System.out.print("testIfTheMoveMethodPositionTheBishopCorrectlyDiagonally  - ");

            Bishop bishopTest = new Bishop(PieceColor.BLACK, 2, 7);

            boolean isValid = bishopTest.isMovePossible(3, 6 );
            String testMessage = (isValid) ? "Valid" : "Fail";
            System.out.println(testMessage);
        }
        public static void testIfBishopMoveIsNotPossible() {

            System.out.print("testIfBishopMoveIsNotPossible  - ");

            Bishop bishopTest = new Bishop(PieceColor.BLACK, 0, 2);

            boolean isValid = (bishopTest.isMovePossible(0, 3) == false);
            String testMessage = (isValid) ? "Valid" : "Fail";
            System.out.println(testMessage);
        }
        public static void run() {

            testIfTheMoveMethodPositionTheBishopCorrectlyDiagonally();
            testIfBishopMoveIsNotPossible();

        }
    }


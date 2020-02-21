import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardValidatorTestWithChecker {

    @Test
    public void testBoardForX() {
        char[][] myGame1 = {
                "XO ".toCharArray(),
                " X ".toCharArray(),
                "O X".toCharArray(),
        };
        assertEquals("X is the Winner!", BoardValidator.checkWinnerWithChecker(myGame1));
    }

    @Test
    public void testBoardForO() {
        char[][] myGame2 = {
                "O X".toCharArray(),
                "XO ".toCharArray(),
                "X O".toCharArray(),
        };
        assertEquals("O is the Winner!", BoardValidator.checkWinnerWithChecker(myGame2));
    }

    @Test
    public void testBoardInvalid() {
        char[][] myGame3 = {
                "OOO".toCharArray(),
                "OXO".toCharArray(),
                "X O".toCharArray(),
        };
        assertEquals("Invalid Board", BoardValidator.checkWinnerWithChecker(myGame3));
    }

    @Test
    public void testBoardNotFinished() {
        char[][] myGame4 = {
                "   ".toCharArray(),
                "   ".toCharArray(),
                "   ".toCharArray(),
        };

        assertEquals("Game yet to finish", BoardValidator.checkWinnerWithChecker(myGame4));
    }

    @Test
    public void testBoardForTie() {
        char[][] myGame5 = {
                "XOO".toCharArray(),
                "OXX".toCharArray(),
                "XXO".toCharArray(),
        };
        assertEquals("Game is a tie", BoardValidator.checkWinnerWithChecker(myGame5));
    }
}
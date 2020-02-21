import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardValidatorTest {

    @Test
    public void testBoardForX() {
        char[][] myGame1 = {
                "XO ".toCharArray(),
                " X ".toCharArray(),
                "O X".toCharArray(),
        };
        assertEquals("X is the Winner!", BoardValidator.checkWinner(myGame1));
    }

    @Test
    public void testBoardForO() {
        char[][] myGame2 = {
                "O X".toCharArray(),
                "XO ".toCharArray(),
                "X O".toCharArray(),
        };
        assertEquals("O is the Winner!", BoardValidator.checkWinner(myGame2));
    }


    @Test
    public void testBoardNotFinished() {
        char[][] myGame4 = {
                "   ".toCharArray(),
                "   ".toCharArray(),
                "   ".toCharArray(),
        };

        assertEquals("Game yet to finish", BoardValidator.checkWinner(myGame4));
    }

}
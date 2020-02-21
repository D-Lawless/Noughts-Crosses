public class BoardValidator {

    //The following function checks for the winner of the game(including a tie), if the game is still ongoing or if the board is invalid.
    public static String checkWinnerWithChecker(char[][] currentGame) {

        int xCount = 0;
        int oCount = 0;
        boolean xWinner = false;
        boolean oWinner = false;
        final String xWinnerStr = "X is the Winner!";
        final String oWinnerStr = "O is the Winner!";
        final String notFinishedStr = "Game yet to finish";
        final String invalidBoard = "Invalid Board";
        final String tieGameStr = "Game is a tie";

        //This loop allows us to look through the board for the placed 'X's and 'O's
        for (int i = 0; i < 3; i++) {

            //This nested for loop allows count number of times 'X' or 'O'
            for (int j = 0; j < 3; j++) {

                if (currentGame[i][j] == 'X') {
                    xCount += 1;
                }
                if (currentGame[i][j] == 'O') {
                    oCount += 1;
                }

            }

            //The following checks the rows for 3 matching
            if (currentGame[i][0] == currentGame[i][1] && currentGame[i][0] == currentGame[i][2]) {
                if (currentGame[i][0] == 'X') {
                    xWinner = true;
                }
                if (currentGame[i][0] == 'O') {
                    oWinner = true;
                }
            }

            //The following checks the columns for 3 matching
            if (currentGame[0][i] == currentGame[1][i] && currentGame[0][i] == currentGame[2][i]) {
                if (currentGame[0][i] == 'X') {
                    xWinner = true;
                }
                if (currentGame[0][i] == 'O') {
                    oWinner = true;
                }
            }
        }

        //This allows us to check if the board is invalid by comparing the amount of X's and O's
        if (xCount > oCount + 1 || xCount < oCount) {
            return invalidBoard;
        }

        // The following checks the boards places diagonally
        if (currentGame[0][0] == currentGame[1][1] && currentGame[0][0] == currentGame[2][2]) {
            if (currentGame[0][0] == 'X') {
                xWinner = true;
            }
            if (currentGame[0][0] == 'O') {
                oWinner = true;
            }
        }

        // The following checks the boards places diagonally in the opposite direction
        if (currentGame[2][0] == currentGame[1][1] && currentGame[0][0] == currentGame[0][2]) {
            if (currentGame[0][0] == 'X') {
                xWinner = true;
            }
            if (currentGame[0][0] == 'O') {
                oWinner = true;
            }
        }


        if (xWinner) {
            return xWinnerStr;
        } else if (oWinner) {
            return oWinnerStr;
        }

        //Checks if 9 tiles are on the board returning a tie output
        if (xCount + oCount == 9) {
            return tieGameStr;
        }

        //If none of the above have caused the function to complete we can consider the game still ongoing.
        return notFinishedStr;

    }

    //The following function checks for the winner of the game and if the game is still ongoing.
    //Although this function is a simplified version it has a lower time complexity.
    public static String checkWinner(char[][] currentGame) {


        boolean xWinner = false;
        boolean oWinner = false;
        final String xWinnerStr = "X is the Winner!";
        final String oWinnerStr = "O is the Winner!";
        final String notFinishedStr = "Game yet to finish";

        //This loop allows us to look through the board for the placed 'X's and 'O's
        for (int i = 0; i < 3; i++) {
            //The following checks the rows for 3 matching
            if (currentGame[i][0] == currentGame[i][1] && currentGame[i][0] == currentGame[i][2]) {
                if (currentGame[i][0] == 'X') {
                    xWinner = true;
                }
                if (currentGame[i][0] == 'O') {
                    oWinner = true;
                }
            }
            //The following checks the columns for 3 matching
            if (currentGame[0][i] == currentGame[1][i] && currentGame[0][i] == currentGame[2][i]) {
                if (currentGame[0][i] == 'X') {
                    xWinner = true;
                }
                if (currentGame[0][i] == 'O') {
                    oWinner = true;
                }
            }
        }

        // The following checks the boards places diagonally
        if (currentGame[0][0] == currentGame[1][1] && currentGame[0][0] == currentGame[2][2]) {
            if (currentGame[0][0] == 'X') {
                xWinner = true;
            }
            if (currentGame[0][0] == 'O') {
                oWinner = true;
            }
        }

        // The following checks the boards places diagonal in the opposite direction
        if (currentGame[2][0] == currentGame[1][1] && currentGame[0][0] == currentGame[0][2]) {
            if (currentGame[0][0] == 'X') {
                xWinner = true;
            }
            if (currentGame[0][0] == 'O') {
                oWinner = true;
            }
        }

        if (xWinner) {
            return xWinnerStr;
        } else if (oWinner) {
            return oWinnerStr;
        }

        //If none of the above have caused the function to complete we can consider the game still ongoing.
        return notFinishedStr;

    }

}

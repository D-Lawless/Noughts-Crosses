public class BoardValidator {

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

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (currentGame[i][j] == 'X') {
                    xCount += 1;
                }
                if (currentGame[i][j] == 'O') {
                    oCount += 1;
                }

            }

            if (currentGame[i][0] == currentGame[i][1] && currentGame[i][0] == currentGame[i][2]) {
                if (currentGame[i][0] == 'X') {
                    xWinner = true;
                }
                if (currentGame[i][0] == 'O') {
                    oWinner = true;
                }
            }

            if (currentGame[0][i] == currentGame[1][i] && currentGame[0][i] == currentGame[2][i]) {
                if (currentGame[0][i] == 'X') {
                    xWinner = true;
                }
                if (currentGame[0][i] == 'O') {
                    oWinner = true;
                }
            }
        }

        if (xCount > oCount + 1 || xCount < oCount) {
            return invalidBoard;
        }


        if (currentGame[0][0] == currentGame[1][1] && currentGame[0][0] == currentGame[2][2]) {
            if (currentGame[0][0] == 'X') {
                xWinner = true;
            }
            if (currentGame[0][0] == 'O') {
                oWinner = true;
            }
        }

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


        if (xCount + oCount == 9) {
            return tieGameStr;
        }

        return notFinishedStr;

    }

    public static String checkWinner(char[][] currentGame) {

        int xCount = 0;
        int oCount = 0;
        boolean xWinner = false;
        boolean oWinner = false;
        final String xWinnerStr = "X is the Winner!";
        final String oWinnerStr = "O is the Winner!";
        final String notFinishedStr = "Game yet to finish";
        final String invalidBoard = "invalidBoard";

        for (int i = 0; i < 3; i++) {

            if (xCount > oCount + 1 || xCount < oCount) {
                return invalidBoard;
            }

            if (currentGame[i][0] == currentGame[i][1] && currentGame[i][0] == currentGame[i][2]) {
                if (currentGame[i][0] == 'X') {
                    return xWinnerStr;
                }
                if (currentGame[i][0] == 'O') {
                    return oWinnerStr;
                }
            }

            if (currentGame[0][i] == currentGame[1][i] && currentGame[0][i] == currentGame[2][i]) {
                if (currentGame[0][i] == 'X') {
                    return xWinnerStr;
                }
                if (currentGame[0][i] == 'O') {
                    return oWinnerStr;
                }
            }
        }

        if (currentGame[0][0] == currentGame[1][1] && currentGame[0][0] == currentGame[2][2]) {
            if (currentGame[0][0] == 'X') {
                xWinner = true;
            }
            if (currentGame[0][0] == 'O') {
                oWinner = true;
            }
        }

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

        return notFinishedStr;

    }

}

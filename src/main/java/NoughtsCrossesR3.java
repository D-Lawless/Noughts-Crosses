public class NoughtsCrossesR3 {

    public static void main(String[] args) {

        char[][] myGame1 = {
                "XO ".toCharArray(),
                " X ".toCharArray(),
                "O X".toCharArray(),
        };

        System.out.println(BoardValidator.checkWinnerWithChecker(myGame1));


    }

}

public class TennisGame {
    static final int NUMBEROFSETS = 3;
    static final int MAXSCORE = 4;

    public static String printScore(int score) {
        if (score == 0) {
            return "Love";
        } else if (score == 1) {
            return "Fifteen";
        } else if (score == 2) {
            return "Thirty";
        } else if (score == 3) {
            return "Forty";
        } else {
            return "Deuce";
        }
    }

    public static String ifPlayerWinAGame(int score1, int score2){
        int minusResult = score1 - score2;
        if (minusResult == 1)
            return "Advantage player1";
        else if (minusResult == -1)
            return "Advantage player2";
        else if (minusResult >= 2)
            return "Win for player1";
        else return "Win for player2";
    }

    public static String getScore(String player1Name, String player2Name, int score1, int score2) {
        String score = "";
        int tempScore = 0;
        boolean equalScore = score1 == score2;
        boolean aPlayerWin = score1 >= MAXSCORE || score2 >= MAXSCORE;

        if (equalScore) {
            score += printScore(score1) + "-All";
        }
        else if (aPlayerWin) {
            score += ifPlayerWinAGame(score1, score2);
        }
        else
        {
            for (int setNumber = 1; setNumber < NUMBEROFSETS; setNumber++) {
                if (setNumber == 1)
                    tempScore = score1;
                else {
                    score += "-";
                    tempScore = score2;
                }
                score += printScore(tempScore);
            }
        }
        return score;
    }
}

package ss8_CleanCode.homework.Model;

public class TennisGame {

    public static final int ScoreZero = 0;
    public static final int ScoreOne = 1;
    public static final int ScoreTwo = 2;
    public static final int ScoreThree = 3;

    public static String getScore(int FirstPlayerScore, int SecondPlayerScore) {
        String score = "";
        int tempScore = 0;
        boolean isDraw = FirstPlayerScore == SecondPlayerScore;
        boolean isWin = FirstPlayerScore >= 4 || SecondPlayerScore >= 4;

        if (isDraw) return getDrawScore(FirstPlayerScore);
        if (isWin)  return getResult(FirstPlayerScore, SecondPlayerScore);

        else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = FirstPlayerScore;
                else {
                    score += "-";
                    tempScore = SecondPlayerScore;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static String getResult(int FirstPlayerScore, int SecondPlayerScore) {
        String score;
        int minusResult = FirstPlayerScore - SecondPlayerScore;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String getDrawScore(int drawScore) {
        String score;
        switch (drawScore) {
            case ScoreZero:
                score = "Love-All";
                break;
            case ScoreOne:
                score = "Fifteen-All";
                break;
            case ScoreTwo:
                score = "Thirty-All";
                break;
            case ScoreThree:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}




//    String FirstPlayer, String SecondPlayer
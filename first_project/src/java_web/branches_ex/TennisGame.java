package java_web.branches_ex;

public class TennisGame {
    //Score all
    public static final int BEGIN_SCORE = 0;
    public static final String SCORE_ALL_0 = "Love-All";
    public static final String SCORE_ALL_15 = "Fifteen-All";
    public static final String SCORE_ALL_30 = "Thirty-All";
    public static final String SCORE_ALL_40 = "Forty-All";
    public static final String SCORE_ALL_NONE = "Deuce";

    //Score Result
    public static final String ADVANTAGE_1 = "Advantage player1";
    public static final String ADVANTAGE_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";

    public static final String SUBTRACT = "-";
    //Score
    public static final String SCORE_0 = "Love";
    public static final String SCORE_15 = "Fifteen";
    public static final String SCORE_30 = "Thirty";
    public static final String SCORE_40 = "Forty";

    //Lấy điểm số
    public static String getScore(String player1Name, String player2Name, int m_score_player1, int m_score_player2) {
        String score = "";
        int tempScore= BEGIN_SCORE;
        if (m_score_player1==m_score_player2)
        {
            score = getScoreDeuce(m_score_player1);
        }
        else if (m_score_player1>=4 || m_score_player2>=4)
        {
            score = getWinOrDeuceForPlayer(m_score_player1, m_score_player2);
        }
        else
        {
            score = getScoreStep(m_score_player1, m_score_player2, score);
        }
        return score;
    }

    //Tính điểm qua tửng màn chơi
    private static String getScoreStep(int m_score_player1, int m_score_player2, String score) {
        int tempScore;
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = m_score_player1;
            else { score += SUBTRACT; tempScore = m_score_player2;}
            switch(tempScore)
            {
                case 0:
                    score += SCORE_0;
                    break;
                case 1:
                    score += SCORE_15;
                    break;
                case 2:
                    score += SCORE_30;
                    break;
                case 3:
                    score += SCORE_40;
                    break;
            }
        }
        return score;
    }

    //Tìm ra người chiến thắng hoặc có lợi thế
    private static String getWinOrDeuceForPlayer(int m_score_player1, int m_score_player2) {
        String score;
        int minusResult = m_score_player1 - m_score_player2;
        if (minusResult==1) score = ADVANTAGE_1;
        else if (minusResult ==-1) score = ADVANTAGE_2;
        else if (minusResult>=2) score = WIN_FOR_PLAYER_1;
        else score = WIN_FOR_PLAYER_2;
        return score;
    }

    //Đưa ra số điểm với người có lợi thế
    private static String getScoreDeuce(int m_score_player1) {
        String score;
        switch (m_score_player1)
        {
            case 0:
                score = SCORE_ALL_0;
                break;
            case 1:
                score = SCORE_ALL_15;
                break;
            case 2:
                score = SCORE_ALL_30;
                break;
            case 3:
                score = SCORE_ALL_40;
                break;
            default:
                score = SCORE_ALL_NONE;
                break;

        }
        return score;
    }
}
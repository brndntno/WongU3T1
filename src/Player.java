public class Player {


    private String name;
    private int score;
    public int winStreak;


    public Player(String name) {
        this.name = name;
        score = 0;
        winStreak = 0;
    }


    public int getScore() {
        return score;
    }


    public String getName() {
        return name;
    }


    public void incrementScore() {
        score++;
    }

    public void incrementScore2() {
        score += 2;
    }


    public void reset() {
        score = 0;
    }
    public int getWinStreak() { return winStreak; }
    public void incrementWinStreak() { winStreak++; }
    public void resetWinStreak() { winStreak = 0; }
}

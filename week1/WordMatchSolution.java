
public class WordMatchSolution {
    private String secret;

    public WordMatchSolution(String word) {
        this.secret = word;
    }

    public int scoreGuess(String guess) {
        int output = 0;
        for (int i = 0; i <= secret.length() - guess.length(); i++) {
            if (secret.substring(i, i + guess.length()).equals(guess)) {
                output++;
            }
        }
        return output * guess.length() * guess.length();
    }

    public String findBetterGuess(String guess1, String guess2) {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);
        if (score1 > score2 || guess1.compareTo(guess2) > 0) {
            return guess1;
        } else {
            return guess2;
        }
    }

    public static void main(String[] args) {
        WordMatchSolution game = new WordMatchSolution("concatenation");
        int test1 = game.scoreGuess("ten");
        int test2 = game.scoreGuess("nation");
        String test3 = game.findBetterGuess("ten", "nation");
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }
}
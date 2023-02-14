
public class WordMatch {
    private String secret;

    public WordMatch(String word) {
        this.secret = word;
    }

    // figures out the game score of a new guess
    public int scoreGuess(String guess) {
        int count = 0;
        int x = guess.length();
        // iterating through secret word
        for (int i = 0; i <= secret.length() - guess.length(); i++) {
            if (guess.equals(secret.substring(i, i + guess.length()))) {
                count++;
            }
        }
        return count * x * x;
    }

    // comparing guess1 and guess 2
    // brainteaser: try to make this shorter.
    public String findBetterGuess(String guess1, String guess2) {
        if (scoreGuess(guess1) > scoreGuess(guess2)) {
            return guess1;
        } else if (scoreGuess(guess1) < scoreGuess(guess2)) {
            return guess2;
        } else if (guess1.compareTo(guess2) > 0) {
            return guess1;
        } else
            return guess2;
    }

    // String.compareTo(String other)

    public static void main(String[] args) {
        WordMatch game = new WordMatch("concatenation");
        int test1 = game.scoreGuess("ten");
        int test2 = game.scoreGuess("nation");
        String test3 = game.findBetterGuess("con", "cat");
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }
}

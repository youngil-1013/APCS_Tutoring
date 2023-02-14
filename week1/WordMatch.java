
public class WordMatch {
    private String secret;

    public WordMatch(String word) {
        this.secret = word;
    }

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

    public String findBetterGuess(String guess1, String guess2) {
        return null;
    }

    public static void main(String[] args) {
        WordMatch game = new WordMatch("concatenation");
        int test1 = game.scoreGuess("ten");
        int test2 = game.scoreGuess("nation");
        String test3 = game.findBetterGuess("ten", "nation");
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }
}

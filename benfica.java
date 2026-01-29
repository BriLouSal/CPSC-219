public class benfica {
    public static void main(String[] args) {
        String wordToGuess = "Benfica";
        char [] guessed =  new char[wordToGuess.length()];
        for (int i = 0; i < wordToGuess.length(); i++) {
            guessed[i] = '_';
        }
        System.out.println(guessed);

    }

}

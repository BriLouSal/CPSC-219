import java.util.Scanner;
import java.lang.System;

public class GuessingGame {
    public static char getUserGuess() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Guess a character: ");
        String userinput = keyboard.nextLine();
        char guess = userinput.charAt(0);
        return guess;
    }

    public static int updateNumberofGuesses(int numOfGuessLeft, char charGuessed, String words, int index) {
        // Convert the arrays into a string
        if(words.indexOf(charGuessed) != 1) {
            return (numOfGuessLeft - index) ;

        }


        return (numOfGuessLeft);
        
    }



     public static void main(String[] args) {

        String wordToGuess = "Banana";
        wordToGuess = wordToGuess.toLowerCase();
        char [] guessed =  new char[wordToGuess.length()];
        for (int i = 0; i < wordToGuess.length(); i++) {
            guessed[i] = '_';
        }
        System.out.println(guessed);
        
        
        
        
        
        
        char guess = getUserGuess();
        guess = Character.toLowerCase(guess);



    
        if (wordToGuess.contains(guess + "")) {
            int count = 0;
            int index = wordToGuess.indexOf(guess);

            while(index != 0) {
                count ++;
                index -= 1;
            }
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (guess == wordToGuess.charAt(i)){
                    
                    int data = updateNumberofGuesses(wordToGuess.length(), guess, wordToGuess, count);
                    guessed[i] = guess;
                    System.out.println(guessed);


                    System.out.println("You have: " + data );
                }

            }

        } else {
            System.out.println(guess + " is NOT in the word!");
        }


    }
}

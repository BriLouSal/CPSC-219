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

     public static void main(String[] args) {
        String wordToGuess = "Banana";
        wordToGuess = wordToGuess.toLowerCase();
        char guess = getUserGuess();
        guess = Character.toLowerCase(guess);
        if (wordToGuess.contains(guess + "")) {
            System.out.println(guess + " is in the word!");
            int index = wordToGuess.indexOf(guess);
            System.out.print(guess + " is at position " + (index + 1));
            while (index != -1) {
                index = wordToGuess.indexOf(guess, index + 1);
                if (index != -1) {
                    System.out.print(" and " + (index + 1));
                }
            }
            System.out.println();
        } else {
            System.out.println(guess + " is NOT in the word!");
        }
    }
}

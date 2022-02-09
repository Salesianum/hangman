package Hangman;

import java.util.ArrayList;

/**
 *  THIS WILL RUN THE GAME LOGIC. KEEPING TRACK OF THE ANSWER, NUMBER OF GUESSES, GUESSES MADE,
 *  AND PROGRESS IN GUESSING THE WORD.
 * 
 *   1. During the game it prints out whether the currently guessed letter is in the word by printing
 *      "you missed: LETTER not in word", where LETTER is replaced by the letter the user guessed.
 * 
 *   2. When the game is over according to processUserGuess, it determines if the user won or not,
 *      prints out the corresponding text: 
 *      
 *      If the user won, it prints out "you guessed the word: " + secretWord.
 *      If the user lost, it prints out "GAME OVER" and then on a new line "word is " + secretWord.
 * 
 *   3. After printing out whether the user won, it also prints "you made GUESSES guesses with MISSES misses"
 *      where GUESSES is the number of guesses by the user and MISSES is the number of misses by the user.
 *      
 *      Your code can keep track of the number of misses as the game is played, or it can calculate the number
 *      of misses at the end by subtracting the number of misses left from the total number of misses allowed.
 * 
 *      Returns: Type: bool
 *      Returns True if the user won the game and False otherwise.
 *  
 */

public class RunGame {
    //THE SECRET WORD IS THE WORD THAT YOU SHOULD TRY AND GUESS
    public static boolean play(){
        String secretWord = LoadFile.getWord(); 


    }

    /** 
     *  THIS FUNCTION WILL KEEP TRACK OF:
     *      GUESSED LETTERS IN AN ARRAY OF ONE LETTER STRINGS
     *      THE NUMBER OF MISSES REMAINING
     *      A LIST OF THE HANGMAN WORD'S GUESSED LETTERS AND IF NOT GUESSED AN _ WILL BE IN IT'S PLACE
     *      
     * THIS METHOD SHOULD RETURN:
     *      Type: string
     *      A string that should be displayed to the user at each turn. Like so:
     *          letters you've guessed: SPACE_SEPARATED_STR_OF_LETTERSGUESSED
     *          misses remaining = MISSESLEFT
     *          SPACE_SEPARATED_STR_OF_HANGMANWORD
     * 
     *      EXAMPLE OF OUTPUT STRING:
     *          letters you've guessed: a e i o s u
     *          misses remaining = 4
     *          s _ _ _ o o _
     * 
     * */

    public static String createDisplayString(ArrayList<String> lettersGuessed, int missesRemaining, ArrayList<String> hangmanWord){
        
    }

    /**
     * Handles the user inputting a letter to guess. It first prints out the displayString, then calls the input function 
     * with "letter> " (note the space after ">") and takes an input from the user. 
     * If that input is not in lettersGuessed, it returns that value. 
     * If that input is in lettersGuessed, it prints out "you already guessed that" and starts over. 
     * Therefore, this function should not return until the user inputs a valid character that has not been guessed yet. 
     * We recommend using a while loop to handle this
     * 
     * PARAMETERS:
     *  lettersGuessed (type: list of strings) - a list of one character strings where each is a letter that the user 
     *  has already guessed
     *  displayString (type: string) - the value returned by createDisplayString
     */


    public static String handleUserInputLetterGuess(ArrayList<String> lettersGuessed, String displayString){

    }

    /**
     * Returns: Type: list
     *      The new hangmanWord, which is a list of strings where each string is a single letter either corresponding
     *      to the same letter in secretWord or '_' if the user has not guessed the letter yet in the game.
     * 
     * 
     * Example:
     *      guessedLetter = "a"
     *      secretWord = "cat"
     *      hangmanWord = ["c", "_", "_"]
     * 
     * Returns ["c", "a", "_"]
     */

    public static ArrayList<String> updateHangmanWord(String guessedLetter, String secretWord, ArrayList<String> hangmanWord){


    }

    public static ArrayList<String> processUserGuess(String guessedLetter, String secretWord, int missesLeft){

    }



}

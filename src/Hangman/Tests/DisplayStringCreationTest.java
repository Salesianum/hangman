package Hangman.Tests;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import Hangman.Main.RunGame;

public class DisplayStringCreationTest {
    @Test
    void displayTest(){
        ArrayList<String> guesses = new ArrayList<String>();
        guesses.add("h");
        guesses.add("y");
        guesses.add("t");
        ArrayList<String> hangman = new ArrayList<String>();
        hangman.add("h");
        hangman.add("_");
        hangman.add("t");
        String output = "letters you've guessed: " + guesses.toString()+"\n"+"misses remaining: "+10+"\n"+hangman;
       
        assertEquals(output, RunGame.createDisplayString(guesses, 10, hangman));
    }
}

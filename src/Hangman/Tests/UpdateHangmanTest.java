package Hangman.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

import Hangman.Main.RunGame;

import java.util.ArrayList;

public class UpdateHangmanTest {
    
    @Test  
    void updaterSingleLetterTest(){
        ArrayList<String> hangmanWord = new ArrayList<String>();
        hangmanWord.add("h");
        hangmanWord.add("_");
        hangmanWord.add("t");
        ArrayList<String> updated = new ArrayList<String>();
        updated.add("h");
        updated.add("a");
        updated.add("t");
        assertEquals(updated, RunGame.updateHangmanWord("a", "hat", hangmanWord));
    }

    @Test
    void updaterMultiLetterTest(){
        ArrayList<String> hangmanWord1 = new ArrayList<String>();
        hangmanWord1.add("_");
        hangmanWord1.add("h");
        hangmanWord1.add("o");
        hangmanWord1.add("w");
        hangmanWord1.add("_");
        ArrayList<String> updated1 = new ArrayList<String>();
        updated1.add("s");
        updated1.add("h");
        updated1.add("o");
        updated1.add("w");
        updated1.add("s");
        assertEquals(updated1, hangmanWord1);
    }
}

package Hangman.Tests;

import org.junit.Test;

import Hangman.Main.RunGame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class ProcessGuessTest {
    
    @Test
    void processGuessTest(){
        String guess = "a";
        ArrayList<String> guesses = new ArrayList<String>();
        guesses.add("h");
        guesses.add("y");
        guesses.add("t");
        int misses = 2;
        ArrayList<String> hangmanUpdated = new ArrayList<String>();
        hangmanUpdated.add("h");
        hangmanUpdated.add("a");
        hangmanUpdated.add("t");
        ArrayList<Object> holder = new ArrayList<Object>();
        holder.add(hangmanUpdated);
        holder.add(misses);
        holder.add(true);
        assertEquals(holder, RunGame.processUserGuess(guess, "hat", misses));
    }

    @Test
    void processGuessTest2(){
        String guess = "a";
        ArrayList<String> guesses = new ArrayList<String>();
        guesses.add("h");
        guesses.add("e");
        guesses.add("t");
        int misses = 2;
        ArrayList<String> hangmanUpdated = new ArrayList<String>();
        hangmanUpdated.add("h");
        hangmanUpdated.add("_");
        hangmanUpdated.add("t");
        ArrayList<Object> holder = new ArrayList<Object>();
        holder.add(hangmanUpdated);
        holder.add(misses+1);
        holder.add(false);
        assertEquals(holder, RunGame.processUserGuess(guess, "hot", misses));
    }
}

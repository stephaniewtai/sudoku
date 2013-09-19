package com.stephaniewtai.sudoku;

/**
 * Model class representing a sudoku puzzle
 */
public class Puzzle {

    // need to decide how to represent puzzles

    // probably need a few constructors
    // one that takes a filename (although arguably parsing should be broken up into its own class)
    // one that is a copy constructor (takes another Puzzle and copies it; backtracking algorithms will need that)

    public boolean valid() {
        // need to implement this
        // carefully choosing how puzzles are represented internally can make this very efficient/easy
        return false;
    }

    public String toString() {
        // need to implement this
        return "";
    }
}

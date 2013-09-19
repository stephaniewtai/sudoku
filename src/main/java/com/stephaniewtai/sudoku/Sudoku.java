package com.stephaniewtai.sudoku;

public class Sudoku {

    private enum Action {
        check, solve;
    }

    public static void main(String[] args) {
        // parse arguments
        // usage: Sudoku ACTION [OPTIONS] INPUT_FILE
        //  e.g., Sudoku check puzzle.txt
        //  e.g., Sudoku solve -algorithm bruteforce puzzle.txt
        Action action = Action.valueOf(args[0]); // missing error handling

        // parse input file to create Puzzle object

        switch (action) {
            case check:
                // call puzzle.valid() and print result
                break;

            case solve:
                // create Solver object
                // call solver.solve(puzzle)
                // print the solved puzzle
                break;
        }
    }
}

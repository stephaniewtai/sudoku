package com.stephaniewtai.sudoku.solver;

import com.stephaniewtai.sudoku.Puzzle;

/**
 * Interface implemented by various solver algorithms
 */
public interface Solver {

    void solve(Puzzle puzzle);
}

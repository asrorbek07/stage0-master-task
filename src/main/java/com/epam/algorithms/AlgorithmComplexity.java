package com.epam.algorithms;

import com.epam.algorithms.utils.Complexity;

public class AlgorithmComplexity {

    /**
     * Return the linear search complexity if the element you are looking for is at the end of the array.
     */
    public Complexity badLinerSearch() {
        return Complexity.O_N; // Worst-case linear search is O(N)
    }

    /**
     * Return the complexity of accessing an array element by index.
     */
    public Complexity arrayIndexItemAccess() {
        return Complexity.O_1; // Array index access is O(1)
    }

    /**
     * Return the complexity of a binary search.
     */
    public Complexity binarySorting() {
        return Complexity.O_LOG_N; // Binary search is O(log N)
    }

    /**
     * Return the complexity of the twoCycleSorting algorithm.
     */
    public Complexity twoCycleSorting() {
        return Complexity.O_N_2; // Sorting with nested loops is O(N^2)
    }
}

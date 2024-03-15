package org.howard.edu.lsp.midterm.question2;

/**
 * Implementation of the Range interface for a range of integers.
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;

    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    @Override
    public boolean overlaps(Range other) {
        IntegerRange otherRange = (IntegerRange) other;
        return lowerBound <= otherRange.getUpperBound() && upperBound >= otherRange.getLowerBound();
    }

    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    /**
     * Gets the lower bound of the range.
     * 
     * @return the lower bound of the range
     */
    public int getLowerBound() {
        return lowerBound;
    }

    /**
     * Gets the upper bound of the range.
     * 
     * @return the upper bound of the range
     */
    public int getUpperBound() {
        return upperBound;
    }
}
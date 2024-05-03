package org.howard.edu.lsp.midterm.question2;

/**
 * Class to test the IntegerRange implementation.
 */
public class RangeTester {
    public static void main(String[] args) {
        // Create two ranges
        Range range1 = new IntegerRange(6, 10);
        Range range2 = new IntegerRange(8, 17);

        // Test the contains method
        System.out.println("Does range1 contain 7? " + range1.contains(7)); // true
        System.out.println("Does range1 contain 12? " + range1.contains(12)); // false

        // Test the overlaps method
        System.out.println("Do range1 and range2 overlap? " + range1.overlaps(range2)); // true

        // Test the size method
        System.out.println("Size of range1: " + range1.size()); 

        // Test the equals method
        System.out.println("Are range1 and range2 equal? " + range1.equals(range2)); // false
    }
}
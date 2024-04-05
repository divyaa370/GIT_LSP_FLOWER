package org.howard.edu.lsp.assignment5;


import java.util.HashSet;
import java.util.Set;

/**
 * The IntegerSet class represents a set of integers. It provides methods for
 * manipulating sets, including adding, removing, and performing set operations
 * such as union, intersection, and difference.
 */

public class IntegerSet {
    // Store the set elements in a Set
    private Set<Integer> set = new HashSet<Integer>();

    // Default Constructor
    public IntegerSet() {
    }
    /**
     * Constructor that initializes an IntegerSet with the specified set of elements.
     *
     * @param set the set of elements to initialize the IntegerSet with
     */

    // Constructor if you want to pass in already initialized
    public IntegerSet(Set<Integer> set) {
        this.set = set;
    }
    
    /**
     * Clears the internal representation of the set.
     */

    
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     *
     * @return the number of elements in the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Returns true if the two sets are equal, false otherwise. Two sets are equal
     * if they contain all of the same values in ANY order.
     *
     * @param o the object to compare with this IntegerSet
     * @return true if the two sets are equal, false otherwise
     */
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerSet that = (IntegerSet) o;
        return set.equals(that.set);
    }

    /**
     * Returns true if the set contains the specified value, false otherwise.
     *
     * @param value the value to search for in the set
     * @return true if the set contains the value, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest element in the set.
     *
     * @return the largest element in the set
     * @throws RuntimeException if the set is empty
     */
    public int largest() {
        if (set.isEmpty()) {
            throw new RuntimeException("IntegerSet is empty");
        }
        return set.stream().max(Integer::compare).orElseThrow();
    }

    /**
     * Returns the smallest element in the set.
     *
     * @return the smallest element in the set
     * @throws RuntimeException if the set is empty
     */
    public int smallest() {
        if (set.isEmpty()) {
            throw new RuntimeException("IntegerSet is empty");
        }
        return set.stream().min(Integer::compare).orElseThrow();
    }

    /**
     * Adds the specified element to the set if it is not already present.
     *
     * @param item the element to add to the set
     */
    public void add(int item) {
        set.add(item);
    }

    /**
     * Removes the specified element from the set if it is present.
     *
     * @param item the element to remove from the set
     */
    public void remove(int item) {
        set.remove((Integer) item);
    }

    /**
     * Modifies this set so that it contains all elements that are in either this set
     * or the specified set.
     *
     * @param intSetb the set to union with this set
     */
    public void union(IntegerSet intSetb) {
        set.addAll(intSetb.set);
    }

    /**
     * Modifies this set so that it contains only elements that are also in the
     * specified set.
     *
     * @param intSetb the set to intersect with this set
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Modifies this set so that it contains only elements that are in this set but
     * not in the specified set.
     *
     * @param intSetb the set to subtract from this set
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Modifies this set so that it contains only elements that are in this set but
     * not in the specified set.
     *
     * @param intSetb the set to subtract from this set
     */
    public void complement(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Returns true if this set contains no elements.
     *
     * @return true if this set contains no elements, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of this set. The string representation
     * consists of a list of the set's elements enclosed in square brackets ("[]").
     *
     * @return a string representation of this set
     */
    public String toString() {
        return set.toString();
    }
}

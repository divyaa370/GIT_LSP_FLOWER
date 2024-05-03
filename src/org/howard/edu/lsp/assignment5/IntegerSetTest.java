package org.howard.edu.lsp.assignment5;


import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
    
    private IntegerSet set;

    @BeforeEach
    public void setUp() {
        Set<Integer> initialSet = new HashSet<>();
        initialSet.add(1);
        initialSet.add(2);
        initialSet.add(3);
        set = new IntegerSet(initialSet);
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(3, set.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        Set<Integer> testSet = new HashSet<>();
        testSet.add(1);
        testSet.add(2);
        testSet.add(3);
        IntegerSet testIntegerSet = new IntegerSet(testSet);
        assertTrue(set.equals(testIntegerSet));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        assertTrue(set.contains(2));
        assertFalse(set.contains(4));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        assertEquals(3, set.largest());
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
        assertEquals(1, set.smallest());
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        set.add(4);
        assertTrue(set.contains(4));
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        set.remove(2);
        assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set.union(set2);
        assertTrue(set.contains(4));
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set.intersect(set2);
        assertFalse(set.contains(4));
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set.diff(set2);
        assertTrue(set.contains(1));
        assertFalse(set.contains(3));
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set.complement(set2);
        assertFalse(set.contains(3));
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertFalse(set.isEmpty());
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        assertEquals("[1, 2, 3]", set.toString());
    }

    @Test
    @DisplayName("Test case for largest with exception")
    public void testLargestException() {
        set.clear();
        assertThrows(RuntimeException.class, () -> {
            set.largest();
        });
    }

    @Test
    @DisplayName("Test case for smallest with exception")
    public void testSmallestException() {
        set.clear();
        assertThrows(RuntimeException.class, () -> {
            set.smallest();
        });
    }
}

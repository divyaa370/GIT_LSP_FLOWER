package org.howard.edu.lsp.assignment4;


public class driver {
    public static void main(String[] args) {
        // Example usage of IntegerSet class
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());
        
        System.out.println("Smallest value in Set2 is: " + set2.smallest());
        System.out.println("Largest value in Set2 is: " + set2.largest());
        
        

       
        
        
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());
     // Set intersection
        set1.clear(); // Clear set 1 for intersection demonstration
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.intersect(set2);
        System.out.println("Intersection of set1 and set 2: " + set1);

        // Set difference
        set1.clear(); // Clear set 1 for difference demonstration
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.diff(set2);
        System.out.println("Difference of set1 and set 2: " + set1);

        // Set complement
        set1.clear(); // Clear set 1 for complement demonstration
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.complement(set2);
        System.out.println("Complement of set1 with respect to set2: " + set1);
    }
}

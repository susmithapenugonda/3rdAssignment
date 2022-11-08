package assignmentthree;

import java.util.ArrayList;
import java.util.List;

public class ForeachIteratorInteger {

	public static void main(String[] args) {
		
		
		// Creating a ArrayList
        List<Integer> myList = new ArrayList<Integer>();
 
        // Adding Integers to the list
        // Custom inputs
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
 
        // For each loop for iterating over the List
        for (int i : myList) {
 
            // Print all elements of List
            System.out.println(i);
        }


	}

}

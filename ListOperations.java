package assignmentthree;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
	
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(33);
		myList.add(44);
		myList.add(55);
		myList.add(66);
		myList.add(77);
		myList.add(88);
		
		System.out.println(myList);
		
		//	Remove second element from list using index
		System.out.println(myList.remove(2));		
		System.out.println(myList);
		
		//Remove second element from list using value
		System.out.println(myList.remove(2));		
		System.out.println(myList);
		
		//Add 90 at index 3
		myList.add(3, 90);
		System.out.println();
	    System.out.println(myList);
	    
	    //Get the length of list
	    System.out.println(myList.size());
		System.out.println();

		 //	Convert List into array.
	    Object[] arr = myList.toArray();
	    
	    //Print all values from list using any values
	    for (Object i : arr)	    	 
            // Print all elements of List
            System.out.println(i);     
	    
	}

}

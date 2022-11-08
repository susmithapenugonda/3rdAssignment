package assignmentthree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegerIterator {

	public static void main(String[] args) {
		
     	List<Integer> myList = new ArrayList<Integer>();
		 
        // Adding Integers to the list
        // Custom inputs
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        
        //iterator
        Iterator<Integer> itr= myList.iterator();
        
        while (itr.hasNext()) {
        	
			Integer list = itr.next();
			
			System.out.println(list);
			
		}
        
	}
}

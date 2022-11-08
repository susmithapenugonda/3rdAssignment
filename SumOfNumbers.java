package assignmentthree;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		
		myList.add(10);
		myList.add(20);
		myList.add(5);
		myList.add(55);
		myList.add(65);
		
		int sum = 0;
		
		for(int i =0; i<myList.size();i++) 
			
			sum += myList.get(i);
			
			System.out.println("Sum is :"  + sum);
		

	}

}

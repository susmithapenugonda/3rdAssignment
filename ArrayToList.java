package assignmentthree;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	
	public static void main(String[] args) {
		
		
		Integer[] numbers = new Integer[] { 1, 2, 3, 4, 5};
		
		List<Integer> list = Arrays.asList(numbers);
		
		System.out.println(list);

	}

}

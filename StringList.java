package assignmentthree;

import java.util.ArrayList;
import java.util.List;

public class StringList {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<>();
		
		// Adding Strings to the list
		list.add( "Web Automation");		
		list.add("API Automation");
		list.add("Mobile Automation");
		
		System.out.println(list);
		
		for(String str:list) {
			
			if(str.contains("Mobile")){
				
				System.out.println(true);
			}
		
			}
		
	}

}

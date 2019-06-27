package com.techlabs.data_structure_test;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	
	public static void main(String args[])
	{
		
		//In it, inserted values are in inserted order...
		
		LinkedHashMap<Integer, String> lhmap=new LinkedHashMap<Integer, String>();
		
		lhmap.put(1, "Chirag");
		lhmap.put(15, "Dev");
		lhmap.put(10, "7");
		lhmap.put(9, "Welcome");
		lhmap.put(20, "You");
		
		System.out.println("Initial Mappings are: " + lhmap); 
		  
        String returned_value = (String)lhmap.put(20, "All"); 
  
        System.out.println("Returned value is: " + returned_value); 
  
        System.out.println("New map is: " + lhmap); 
        
        System.out.println("On removal hash map is: "+lhmap.remove(15));
        
        System.out.println("New map is: " + lhmap);
  
	}

}

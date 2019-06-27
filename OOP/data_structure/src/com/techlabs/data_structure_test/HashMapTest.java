package com.techlabs.data_structure_test;

import java.util.HashMap;

public class HashMapTest {

	    public static void main(String[] args) 
	    { 
	    	
	    	//In it, inserted key and value pair are in any order...
	  
	        HashMap<Integer, String> hash_map=new HashMap<Integer, String>();
	          
	        hash_map.put(10, "Chirag"); 
	        hash_map.put(15, "9"); 
	        hash_map.put(20, "Raj"); 
	        hash_map.put(25, "Welcomes"); 
	        hash_map.put(30, "You"); 
	  
	        System.out.println("Initial Mappings are: " + hash_map); 
	  
	        String returned_value = (String)hash_map.put(20, "Dev"); 
	  
	        System.out.println("Returned value is: " + returned_value); 
	  
	        System.out.println("New map is: " + hash_map); 
	        
	        System.out.println("On removal hash map is: "+hash_map.remove(15));
	        
	        System.out.println("New map is: " + hash_map);
	    } 
}

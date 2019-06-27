package com.techlabs.data_structure_test;

import java.util.TreeMap;

public class TreeMapTest {
	
	public static void main(String[] args) 
    { 
		
		//In it, inserted values are in increasing order(i.e., using key)...even though inserted in any order...
  
        TreeMap<Integer, String> tree_map=new TreeMap<Integer, String>(); 
  
        tree_map.put(35, "Chirag"); 
        tree_map.put(15, "100"); 
        tree_map.put(20, "Dev"); 
        tree_map.put(2, "Welcomes"); 
        tree_map.put(30, "You"); 
  
        System.out.println("Initial Mappings are: " + tree_map); 
  
        String returned_value = (String)tree_map.put(20, "All"); 
  
        System.out.println("Returned value is: " + returned_value); 
  
        System.out.println("New map is: " + tree_map); 
        
        System.out.println("On removal hash map is: "+tree_map.remove(15));
        
        System.out.println("New map is: " + tree_map);
    } 

}

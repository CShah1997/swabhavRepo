package com.techlabs.singleton_pattern_test;
import com.techlabs.singleton_pattern.*;

public class SingletonObjectTest {
	
	public static void main(String args[]){
		SingletonObject obj=SingletonObject.getInstance();
		obj.display();
	}

}

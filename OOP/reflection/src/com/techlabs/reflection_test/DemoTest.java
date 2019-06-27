package com.techlabs.reflection_test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.techlabs.reflection.*;

public class DemoTest {

	public static void main(String args[]) throws Exception{
		
		
		Demo demo=new Demo();
		demo.setClassName("java.io.File");
		
		System.out.println(demo.getClassName());
		
		Object obj=demo.getClassName();
	
		Class cls=obj.getClass();
		
				
		int count[] = new int[4];
		Method[] methods = cls.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			if (methods[i].getName().startsWith("set") == true) {
				count[0]++;
			} else if (methods[i].getName().startsWith("get") == true) {
				count[1]++;
			}
			count[2]++;
		}
		System.out.println("Count of setter= " + count[0]);
		System.out.println("Count of getter= " + count[1]);
		System.out.println("Total count of methods= " + count[2]);
		
		/*Demo obj = new Demo();
		Class cls = obj.getClass();
		int count[] = new int[4];
		Method[] methods = cls.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			if (methods[i].getName().startsWith("set") == true) {
				count[0]++;
			} else if (methods[i].getName().startsWith("get") == true) {
				count[1]++;
			}
			count[2]++;
		}
		System.out.println("Count of setter= " + count[0]);
		System.out.println("Count of getter= " + count[1]);
		System.out.println("Total count of methods= " + count[2]);

		Constructor[] constructors = cls.getDeclaredConstructors();
		for (int i = 0; i < constructors.length; i++) {
			//System.out.println(constructors[i].getName());
			count[3]++;
		}
		System.out.println("Count of constructors= "+count[3]);*/
		
	}

}

package com.techlabs.annotation_demo_test;

import java.lang.reflect.Method;

import com.techlabs.annotation_demo.Foo;
import com.techlabs.annotation_demo.RequireRefactoring;

@Deprecated
public class FooTest {
	
	private static int count=0;
	
	public static void main(String args[]) throws Exception
	{
		
        Class<Foo> c=Foo.class;
        Method[] methods = c.getDeclaredMethods();
        for(int i=0;i<methods.length;i++)
        {
        	if(methods[i].getAnnotation(RequireRefactoring.class)!=null)   
        	{
        		System.out.println(methods[i].getName());
        		count=count+1;
        	}
        }
        System.out.println(count);
        
	}

}

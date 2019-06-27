package com.techlabs.human_app.test;
import com.techlabs.human_app.*;

public class HumanTest {
	
	public static void main(String args[])
	{
		Human h1=new Human("Chirag", 22, (float) 4.3, 45, GenderType.MALE);
		System.out.println("Category "+h1.bodyCategory());
		System.out.println("BMI "+h1.calBMI());
		h1.eat();
		System.out.println("AGE "+h1.getAge());
		System.out.println("Height "+h1.getHeight());
		System.out.println("Name "+h1.getName());
		System.out.println("Weight "+h1.getWeight());
		
		
		/*System.out.println();
		Human h2=new Human("DEV", 18);
		System.out.println("Category "+h2.bodyCategory());
		System.out.println("BMI "+h2.calBMI());
		h1.eat();
		System.out.println("AGE "+h2.getAge());
		System.out.println("Height "+h2.getHeight());
		System.out.println("Name "+h2.getName());
		System.out.println("Weight "+h2.getWeight());
		*/
	}

}

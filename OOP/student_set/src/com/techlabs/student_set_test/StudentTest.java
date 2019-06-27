package com.techlabs.student_set_test;
import java.util.HashSet;

import com.techlabs.student_set.*;

public class StudentTest {
	
	public static void main(String args[])
	{
		HashSet<Student> hset=new HashSet<Student>();
		
		Student student=new Student(1, "Chirag", 10, 8.0);
		Student student1=new Student(1, "Chirag", 10, 8.0);
		Student student2=new Student(1, "Chirag", 10, 8.0);
		Student student3=new Student(2, "Chirag", 12, 8.0);
		hset.add(student);
		hset.add(student1);
		hset.add(student2);
		hset.add(student3);
		System.out.println("Size= "+hset.size());
		
		for(Student s:hset){  
		    System.out.println(s.rollNo+" "+s.name+" "+s.std+" "+s.cgpa);  
		    }  
		
		
	}

}

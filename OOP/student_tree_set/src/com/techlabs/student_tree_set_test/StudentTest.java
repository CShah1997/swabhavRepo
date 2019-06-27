package com.techlabs.student_tree_set_test;

import java.util.TreeSet;

import com.techlabs.student_tree_set.*;

public class StudentTest {
	
	public static void main(String args[])
	{
		TreeSet<Student> tree_set=new TreeSet<Student>(new MyNameCOmparator());
		Student stud1=new Student(5, "Chirag", 10, 8.0);
		Student stud2=new Student(4, "Dev", 10, 7.0);
		tree_set.add(stud1);
		tree_set.add(stud2);
		//stud1.compareTo(stud2);
		for(Student s:tree_set)
		{
			System.out.println(s.getRollNo()+" "+s.getName()+" "+s.getStd()+" "+s.getCgpa());
		}
		
		System.out.println();
		
		
		TreeSet<Student> tree_set1=new TreeSet<Student>(new MyCgpaComparator());
		Student stud11=new Student(5, "C", 10, 8.0);
		Student stud22=new Student(4, "D", 10, 7.0);
		tree_set1.add(stud11);
		tree_set1.add(stud22);
		//stud11.compareTo(stud22);
		for(Student s1:tree_set1)
		{
			System.out.println(s1.getRollNo()+" "+s1.getName()+" "+s1.getStd()+" "+s1.getCgpa());
		}
		
	}

}



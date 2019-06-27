package com.techlabs.student_tree_set;

import java.util.Collection;

public class Student implements Comparable<Student> {
	
	private int rollNo;
	private String name;
	private int std;
	private float cgpa;
	
	public Student(int rollNo,String name,int std,double cgpa)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.std=std;
		this.cgpa=(float) cgpa;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public int getStd() {
		return std;
	}

	public float getCgpa() {
		return cgpa;
	}

	public int compareTo(Student stud2) {
		if(this.getRollNo()>stud2.getRollNo())
		{
			return 1;
		}
		else if(this.getRollNo()<stud2.getRollNo())
		{
			return -1;
		}
		return 0;
	}


}


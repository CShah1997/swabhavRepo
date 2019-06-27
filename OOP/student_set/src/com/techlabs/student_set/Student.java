package com.techlabs.student_set;

public class Student {
	
	public int rollNo;
	public String name;
	public int std;
	public float cgpa;
	
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNo;
		result = prime * result + std;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNo != other.rollNo)
			return false;
		if (std != other.std)
			return false;
		return true;
	}

	public Student(int rollNo, String name, int std, double cgpa) {
		this.rollNo = rollNo;
		this.name = name;
		this.std = std;
		this.cgpa = (float) cgpa;
	}
		
}

package com.techlabs.student_tree_set;

import java.util.Comparator;

public class MyNameCOmparator implements Comparator<Student>{

	public int compare(Student stud1, Student stud2) {
		return stud1.getName().compareTo(stud2.getName());
	}

}

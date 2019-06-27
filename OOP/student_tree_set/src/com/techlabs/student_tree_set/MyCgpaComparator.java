package com.techlabs.student_tree_set;

import java.util.Comparator;

public class MyCgpaComparator implements Comparator<Student> {

	public int compare(Student stud11, Student stud22) {
		if (stud11.getCgpa() > stud22.getCgpa()) {
			return 1;
		} else {
			return -1;
		}
	}
}

package student_tree_map;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.techlabs.student_tree_set.*;

public class StudentHashMap {
	
	public static void main(String args[])
	{
		HashMap<Student, Student> hmap=new HashMap<Student, Student>();
		Student stud1=new Student(1, "Chirag", 10, 8.0);
		Student stud2=new Student(2, "Dev", 12, 7.0);
		hmap.put(stud1, stud1);
		hmap.put(stud2, stud2);
		hmap.put(stud1, stud2);
		
		for(Map.Entry<Student, Student> mapList : hmap.entrySet())
		{
			System.out.println(mapList.getKey().getName()+":"+mapList.getValue().getName());
		}
		
		System.out.println();
		
		TreeMap<Student, Student> tmap=new TreeMap<Student, Student>();
		Student stud11=new Student(2, "C", 10, 8.0);
		Student stud22=new Student(1, "D", 12, 7.0);
		tmap.put(stud11, stud11);
		tmap.put(stud22, stud22);
		tmap.put(stud11, stud22);
		
		for(Map.Entry<Student, Student> treeMapList : tmap.entrySet())
		{
			System.out.println(treeMapList.getKey().getName()+":"+treeMapList.getValue().getName());
		}
		
	}

}

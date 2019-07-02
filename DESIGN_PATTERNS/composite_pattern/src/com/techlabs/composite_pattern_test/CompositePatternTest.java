package com.techlabs.composite_pattern_test;

import com.techlabs.composite_pattern.File;
import com.techlabs.composite_pattern.Folder;
import com.techlabs.composite_pattern.IDirectoryComponent;

public class CompositePatternTest {
	
	public static void main(String args[])
	{
		IDirectoryComponent file1=new File("Annabela", "mp4");
		IDirectoryComponent file2=new File("Golmaal", "mp4");
		IDirectoryComponent file3=new File("Annabela: Returns Home", "avi");
		IDirectoryComponent file4=new File("Wanted", "mp4");
		IDirectoryComponent file5=new File("Welcome", "mp4");
		
		Folder horrorMovies=new Folder("Horror Movies");
		Folder familyMovies=new Folder("Family Movies");
		
		horrorMovies.addFiles(file1);
		horrorMovies.addFiles(file3);
		familyMovies.addFiles(file2);
		familyMovies.addFiles(file4);
		familyMovies.addFiles(file5);
		
		Folder movies=new Folder("Movies");
		movies.addFiles(horrorMovies);
		movies.addFiles(familyMovies);
				
		movies.display();
		
		Folder games=new Folder("Games");
		games.display();
	}

}

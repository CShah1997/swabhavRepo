package com.techlabs.composite_pattern;

import java.util.ArrayList;

public class Folder implements IDirectoryComponent{

	private String folderName;
	private ArrayList<IDirectoryComponent> listOfFiles;
	private String level="";
	
	public Folder(String folderName) {
		this.folderName = folderName;
		listOfFiles=new ArrayList<IDirectoryComponent>();
	}
	
	@Override
	public void setLevel(String level) {
		this.level=level;		
	}
	
	public void addFiles(IDirectoryComponent file)
	{
		file.setLevel(this.getLevel()+"\t");
		listOfFiles.add(file);
	}

	public String getLevel() {
		return level;
	}
	
	@Override
	public void display() {
		System.out.println(level+"Folder: "+folderName);
		for(IDirectoryComponent file:listOfFiles)
		{
			file.display();
		}	
	}

	

}

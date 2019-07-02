package com.techlabs.composite_pattern;

public class File implements IDirectoryComponent {

	private String movieName;
	private String extension;
	private String level="\t";
	
	public File(String movieName, String extension) {
		this.movieName = movieName;
		this.extension = extension;
	}

	@Override
	public void setLevel(String level) {
		this.level=level;
	}

	public String getLevel() {
		return level;
	}
	
	@Override
	public void display() {
			System.out.println(this.getLevel()+"\t"+movieName+"."+extension);
	}

	
}

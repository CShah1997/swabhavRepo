package com.techlabs.rectangle;

public class Rectangle {

	private static final int LOW_DIMEN = 1, UPP_DIMEN = 100;
	private int height, width;
	private String DEF_COL="Red";
	private String color;
	
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public String getColor() {
		return color;
	}

	
	public void setColor(String newColor)
	{
		color=valColor(newColor);
	}
	
	private String valColor(String newColor) {
		// TODO Auto-generated method stub
		if(newColor=="Blue")
		{
			return "Blue";
		}
		else if(newColor=="Green")
		{
			return "Green";
		}
		return DEF_COL;
		
	}

	public void setHeight(int newHeight) {

		height = validate(newHeight);

	}

	public void setWidth(int newWidth) {

		width = validate(newWidth);

	}

	private int validate(int dimen) {
		// TODO Auto-generated method stub
		if (dimen < LOW_DIMEN) {
			dimen = LOW_DIMEN;
		} else if (dimen > UPP_DIMEN) {
			dimen = UPP_DIMEN;
		}
		return dimen;
	}
	

	public int calcArea() {
		return (height * width);
	}

}

package com.techlabs.lsp_solution;

public class Square implements Shape{

	private int side;
	
	public Square(int side) {
		this.side=side;
	}
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	
	public double calculateArea()
	{
		return side * side;
	}
	
	
}

package com.techlabs.passbyvalue;

public class PassByValue {
	
	public static void main(String args[])
	{
		int marks=100;
		
		PassByValue s=new PassByValue();
		s.changeMarksToZero(marks);
		
		System.out.println(marks);
		
		int marks1[]={10,20,30};
		
		s.changeMarksToZero(marks1);
		
		for(int m:marks1)
		{
			System.out.println(m);
		}
		
	}
	private void changeMarksToZero(int marks)
	{
		marks=0;
	}
	
	private void changeMarksToZero(int marks1[])
	{
		int i;
		for(i=0;i<marks1.length;i++)
		{
			marks1[i]=0;
		}
	}
	

}

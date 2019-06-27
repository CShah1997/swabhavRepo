package com.techlabs.reflection;

public class Demo {
	
	/*private int a1,a2;
	
	public int getData()
	{
		return a1;
	}
	
	public void setData(int newData)
	{
		a1=newData;
	}
	
	public void setData1(int newData1)
	{
		a2=newData1;
	}
	
	public void rename()
	{
		
	}*/
	
	
	private Class className;
	public String getClassName()
	{
		return className.toString();
	}
	public void setClassName(String newClassName)
	{
		try {
			className=Class.forName(newClassName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

package com.techlabs.book_e5;

public class MultiFor {
	
	public static void main(String args[])
	{
		int x;
		for(x=0;x<4;x++)
		{
			int y;
			for(y=4;y>2;y--)
			{
				System.out.println(x+""+y);
			}
			if(x==1)
			{
				x++;
			}
		}
	}

}

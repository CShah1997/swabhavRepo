package com.techlabs.assignment_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class UserGuessNum {
	
	public static void main(String args[])
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter a number to be guessed");
			int num=Integer.parseInt(br.readLine());
			System.out.println(num);
			Random rand=new Random();
			int randNum=rand.nextInt(100);
			System.out.println("Random number generated:"+randNum);
			if(num>randNum)
			{
				System.out.println("Gussed number is high...");
			}
			else if(num<randNum)
			{
				System.out.println("Gussed number is low...");
			}
			else
			{
				System.out.println("Matched number...");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

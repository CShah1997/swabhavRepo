package com.techlabs.movable_interface_test;

import com.techlabs.movable_interface.Bike;
import com.techlabs.movable_interface.Car;
import com.techlabs.movable_interface.IMovable;
import com.techlabs.movable_interface.Truck;

public class Move_Test {
	
	public static void main(String args[])
	{
		IMovable imovable[]=new IMovable[3];
		imovable[0]=new Truck();
		imovable[1]=new Car();
		imovable[2]=new Bike();
		
		startRace(imovable);
	}

	private static void startRace(IMovable[] imovable) {
		
		for(int i=0;i<imovable.length;i++)
		{
			imovable[i].move();
		}
		
	}

}

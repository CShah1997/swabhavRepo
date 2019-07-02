package com.techlabs.adapter_pattern;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList<T> {
	
	private LinkedList<T> linkedList;

	public MyLinkedList() {
		linkedList=new LinkedList<T>();
	}
	
	public void addElementAtLast(T item)
	{
		linkedList.add(item);
	}

	public void addElementAtFirst(T item)
	{
		linkedList.add(item);
	}
	
	public T removeElementFromLast()
	{
		return linkedList.removeLast();
	}
	
	public T removeElementFromFirst()
	{
		return linkedList.removeFirst();
	}
	
	public int getSizeOfLinkedList()
	{
		return linkedList.size();
	}
	
	public Iterator<T> iterator()
	{
		return linkedList.iterator();
		
	}
}

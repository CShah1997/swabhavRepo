package com.techlabs.adapter_pattern;

import java.util.Iterator;

public class LinkedListAdapter<T> implements IQueue<T>{
	
	private MyLinkedList<T> linkedList;
	

	public LinkedListAdapter(MyLinkedList<T> linkedList) {
		this.linkedList = linkedList;
	}

	@Override
	public Iterator<T> iterator() {
		return linkedList.iterator();
	}

	@Override
	public void enqueue(T element) {
		linkedList.addElementAtLast(element);
	}

	@Override
	public T dequeue() {
		return linkedList.removeElementFromFirst();
	}

	@Override
	public int count() {
		return linkedList.getSizeOfLinkedList();
	}

}

package com.techlabs.adapter_pattern;

public interface IQueue<T> extends Iterable<T>{
	
	public void enqueue(T element);
	public T dequeue();
	public int count();

}

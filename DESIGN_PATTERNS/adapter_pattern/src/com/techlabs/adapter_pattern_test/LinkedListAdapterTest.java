package com.techlabs.adapter_pattern_test;

import com.techlabs.adapter_pattern.IQueue;
import com.techlabs.adapter_pattern.LinkedListAdapter;
import com.techlabs.adapter_pattern.MyLinkedList;

public class LinkedListAdapterTest {
	
	public static void main(String args[])
	{
		MyLinkedList<String> linkedList=new MyLinkedList<String>();
		IQueue<String> stringQueue=new LinkedListAdapter<String>(linkedList);
		stringQueue.enqueue("Chirag");
		stringQueue.enqueue("Priyanka");
		stringQueue.enqueue("Shah");
		
		System.out.println("No. of elements in linkedlist: "+stringQueue.count());
		
		//Elements removed from first...
		stringQueue.dequeue();
		stringQueue.dequeue();
		
		System.out.println("No. of elements in linkedlist: "+stringQueue.count());
		
		//Elements added from last...
		stringQueue.enqueue("PriyankaShah");
		stringQueue.enqueue("ChiragShah");
		
		for(String str:stringQueue)
		{
			System.out.println(str);
		}
		
		
		
	}

}

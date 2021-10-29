package com.linkedlist;

import java.util.LinkedList;

/*
 * Data Structure Linked List
 */
public class LinkedListMain {

	public static void main(String[] args) {
	
		System.out.println("Welcome to custom LinkedList program");
		
		LinkedList<Integer> mylist = new LinkedList<Integer>();
		mylist.add(0, 56);
		mylist.add(1, 30);
		mylist.add(2, 70);
	
		System.out.println(mylist);
	
	}

}

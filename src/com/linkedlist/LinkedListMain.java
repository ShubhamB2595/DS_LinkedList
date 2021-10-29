package com.linkedlist;

/*
 * Data Structure Linked List
 */
public class LinkedListMain {

	public static void main(String[] args) {
	
		//System.out.println("Welcome to custom LinkedList program");
		
		CustomLinkedList mylist = new CustomLinkedList();
		
		mylist.add(56);
		mylist.add(30);
		mylist.add(40);
		mylist.add(70);
		
		// Sorting the data in ascending order
		System.out.println("Before sorting");
		mylist.print();
		System.out.println("");
		mylist.sortAsc();
		System.out.println("After sorting");
		mylist.print();
		System.out.println("");
		
		
	}

}

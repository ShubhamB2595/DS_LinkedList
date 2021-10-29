package com.linkedlist;

/*
 * Data Structure Linked List
 */
public class LinkedListMain {

	public static void main(String[] args) {
	
		System.out.println("Welcome to custom LinkedList program");
		
		CustomLinkedList mylist = new CustomLinkedList();
		mylist.add(56);
		mylist.add(30);
		mylist.add(70);
		mylist.print(mylist.head);
	
	}

}

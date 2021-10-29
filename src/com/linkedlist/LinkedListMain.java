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
		mylist.print();
		System.out.println("");
	
		//inserting 40 and delete it and printing the size of Linked list
		int pos30 = mylist.searchPosition(30);
		mylist.insert(pos30+1, 40);
		mylist.print();
		System.out.println("");
		System.out.println("Before deleting, Size of my Linked list is: " + mylist.size());
		int getIndex = mylist.searchPosition(40);
		mylist.deletePosition(getIndex);
		mylist.print();
		System.out.println("");
		System.out.println("After deleting, Size of my Linked list is: " + mylist.size());
	}

}

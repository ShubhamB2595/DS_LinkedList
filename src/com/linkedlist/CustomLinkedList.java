package com.linkedlist;
/*
 * class for the custom linked list
 */
public class CustomLinkedList {

	Node head;
	
	// class for operations of Linked List
	class Node {
		int data;
		Node next;
		
		//Constructor for class Node
		public Node(int data) {
			super();
			this.data = data;
			next = null;
		}	
	}
	
	//method for adding the data to linked list
	public void add(int data) {
		
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		else {
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = toAdd;
		}
	}
	
	//method for printing the linked list data
	public void print(){
		
		if(isEmpty()) {
			System.out.println("Linked list is Empty");
			return;
		}
		else {
			Node temp = head;
			
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}
	
	// method for checking head is null
	boolean isEmpty() {
		
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//method for inserting at specific position
	public void insert(int pos, int data) {
		
		Node toInsert = new Node(data);
	
		if(isEmpty()) {
			head = toInsert;
		}
		else {
			Node temp = head;
		
			for(int i=0; i<pos-1; i++) {
				temp = temp.next; 
			}
			toInsert.next = temp.next;
			temp.next = toInsert;
		}
	}
	
	//method for deleting 1st element
	public void deleteFirst() {
		
		if(isEmpty()) {
			System.out.println("Linked list is Empty");
			return;
		}
		else {
			Node temp = head;
			temp = temp.next;
			head = temp;
		}
	}
	
	//method for deleting last element
	public void deleteLast() {
			
		if(isEmpty()) {
			System.out.println("Linked list is Empty");
			return;
		}
		else {
			Node temp = head;
			Node temp1 = temp.next;
			
			while(temp1.next != null) {
				temp = temp1;
				temp1 = temp1.next;
			}
			temp.next = null;
		}
	}
	
	//method for deleting element as specific position
	public void deletePosition(int pos) {
				
		if(isEmpty()) {
			System.out.println("Linked list is Empty");
			return;
		}
		else {
			Node temp = head;
			Node temp1 = temp.next;
				
			for(int i=0; i<pos-1; i++) {
				temp = temp1;
				temp1 = temp1.next;
			}
			temp.next = temp1.next;
		}
	}
	
	
	//method for searching the data and its position
	public int searchPosition(int data) {
		
		if(isEmpty()) {
			System.out.println("Linked list is Empty");
		}
		else {
			Node temp = head;
			int index = 0;
			while(temp != null) {
				if(data == temp.data) {
				System.out.println("Position for data: " + data + " at index: " + index);
				return index;
				}
				else {
					index++;
					temp = temp.next;
				}
			}
		}
		return -1;
	}
	
	// method for getting the size of linked list
	public int size() {
		
		if(isEmpty()) {
			System.out.println("Linked list is Empty");
			return 0;
		}
		else {
			Node temp = head;
			int count = 0;
			while(temp != null) {
				count++;
				temp = temp.next;
			}
			return count;
		}
	}
	
	@Override
	public String toString() {
		return "CustomLinkedList [head=" + head + "]";
	}
	
	
}

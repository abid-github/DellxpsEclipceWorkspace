package com.algo.ds;

class LinkedList {

	
	
	//https://www.youtube.com/watch?v=myqO52fwY5k
	//https://www.geeksforgeeks.org/reverse-a-linked-list/
	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Function to reverse the linked list */
	Node reverse(Node current) {
		Node prev = null;
		// Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		// node = prev;
		return prev;
	}

	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver Code
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		LinkedList.head = new Node(85);
		LinkedList.head.next = new Node(15);
		LinkedList.head.next.next = new Node(4);
		LinkedList.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);

		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}
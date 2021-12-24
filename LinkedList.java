package binarysearch;

//Bubble sort
public class LinkedList {

	static class Node {
		int data;
		Node next;
	}

	public Node head;

	// Class constructors
	LinkedList() {
		head = null;
	}

	// insert element
	public void insert(int value) {
		// Create node
		Node node = new Node();
		node.data = value;
		node.next = null;
		if (head == null)
			head = node;
		else {
			Node temp = head;
			// find last node
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}

	}

	// Display all Linked List elements
	public void display() {
		if (head != null) {

			Node temp = head;
			while (temp != null) {
				System.out.print("  " + temp.data);
				temp = temp.next;
			}
		} else {
			System.out.println("Empty Linked list");
		}
	}

	// perform bubble sort in single linked list
	public void bubbleSort() {

		if (head != null) {

			Node current = null;

			int status = 0;
			do {
				current = head;
				status = 0;
				while (current != null && current.next != null) {

					if (current.data > current.next.data) {
						// Swap node values
						status = 1;
						current.data = current.data + current.next.data;

						current.next.data = current.data - current.next.data;

						current.data = current.data - current.next.data;
					}
					current = current.next;
				}

			} while (status == 1);

		} else {
			System.out.println("Empty Linked list");
		}
	}

	public static void main(String[] args) {

		LinkedList obj = new LinkedList();
		// insert element of linked list
		obj.insert(7);
		obj.insert(50);
		obj.insert(2);
		obj.insert(42);
		obj.insert(15);
		System.out.print("Before sort : ");

		// display all node
		obj.display();

		obj.bubbleSort();
		System.out.print("\nAfter sort  : ");

		obj.display();
	}
}
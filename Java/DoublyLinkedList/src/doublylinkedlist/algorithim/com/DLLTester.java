package doublylinkedlist.algorithim.com;

public class DLLTester {

	public static void main(String[] args) {
		DoublyLinkedList myList = new DoublyLinkedList();
		
		myList.addAtHead("First");
		myList.addAtTail("Second");
		myList.addAtTail("Third");

		myList.printList();
	}

}

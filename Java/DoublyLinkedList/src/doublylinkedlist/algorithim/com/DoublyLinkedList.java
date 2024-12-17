package doublylinkedlist.algorithim.com;

public class DoublyLinkedList {
	private DLNode head;
	private DLNode tail;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
	}
	
	public String get(int index) {
		DLNode runner = this.head;
        int count = 0;
        while( (runner != null) && (count != index)) {
            runner = runner.next;
            count += 1;
        }
        if (runner == null) {
            return "-1";
        }
        return runner.value;
	}
	
	public void addAtTail(String value) {
		DLNode new_node = new DLNode(value);
	    if (this.head == null) {
	        this.head = this.tail = new_node;
	    } else {
	        new_node.prev = this.tail;
	        this.tail.next = new_node;
	        this.tail = new_node;
	    }
	}
	
	public void addAtHead(String value) {
		DLNode new_node = new DLNode(value);
		if (this.head == null) {
			this.head = this.tail = new_node;
		} else {
            new_node.next = this.head;
    		this.head.prev = new_node;
			this.head = new_node;
        }
	}
	
	public void printList() {
		DLNode runner = head;
		System.out.println("==== Printing Doubly Linked List ====");
		while(runner != null) {
			System.out.println(runner.value);
			runner = runner.next;
		}
		System.out.println("=======================================");
	}
	
	public void addAtIndex(String value, int position) {
		DLNode new_node = new DLNode(value);
        if ((position > 0) && (this.head == null)) {
        	return;
        }
        if (position == 0) {
            this.addAtHead(value);
            return;
        }
        DLNode runner = this.head;
        int count = 0;
        while ((runner.next != null) && (count < position - 1)) {
            runner = runner.next;
            count += 1;
        }
        if (runner != null) {
	        new_node.next = runner.next;
	        new_node.prev = runner;
	        if (runner.next != null) {
	            runner.next.prev = new_node;
	        } else {
	            this.tail = new_node;
	            runner.next = new_node;
	        }
        }
	}
	
	public void deleteFromFront() {
		DLNode node = this.head;
        if (node == null) {
            return;
        }
        if (node.next == null) {
            this.head = null;
            this.tail = null;
            return;
        }
        DLNode second_node = node.next;
        second_node.prev = null;
        this.head = second_node;
	}
	
	public void deleteAtIndex(int position) {
		if (position == 0) {
            this.deleteFromFront();
            return;
		}
        DLNode runner = this.head;
        int count = 0;
        while ((runner != null) && (count != position)) {
            runner = runner.next;
            count += 1;
        }
        if (runner == null) {
            return;
        }
        DLNode previous_node = runner.prev;
        DLNode next_node = runner.next;
        if (previous_node != null) {
            previous_node.next = next_node;
        }
        if (next_node != null) {
            next_node.prev = previous_node;
        } else {
            this.tail = previous_node;
        }
	}
	
	public void deleteMiddle() {
		DLNode fast = this.head;
		DLNode slow = this.head;
		while(fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		DLNode prev_node = slow.prev;
		DLNode next_node = slow.next;
		next_node.prev = prev_node;
		prev_node.next = next_node;
	}
}

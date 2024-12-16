package doublylinkedlist.algorithim.com;

public class DLNode {
	String value;
	DLNode next;
	DLNode prev;
	
	public DLNode(String value) {
		this.value = value;
		next = null;
		prev = null;
	}
}

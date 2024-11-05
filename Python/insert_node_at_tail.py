class SinglyLinkedListNode:
    def __init__(self, data):
        self.data = data
        self.next = None
    def insertNodeAtTail(head, data):
        new_node = SinglyLinkedListNode(data)
        if head is None:
            return new_node
        current = head
        while current.next:
            current = current.next
        current.next = new_node
        return head
class QueueElement:
    def __init__(self, val):
        self.value = val
        self.next = None

class Queue:
    def __init__(self):
        self.top = None
    def enqueue(self, val):
        if not self.top:
            new_element = QueueElement(val)
            self.top = new_element
            return self
        new_element = QueueElement(val)
        runner = self.top
        while (runner.next):
            runner = runner.next
        runner.next = new_element
        return self
    def dequeue(self):
        if not self.top:
            return None
        self.top = self.top.next
        return self.top
    def peek(self):
        print(self.top.value)
        return self.top
    def print_values(self):
        runner = self.top
        while runner is not None:
            print(runner.value)
            runner = runner.next
        return self
    def is_empty(self):
        return True if not self.top else False

queue = Queue()

queue.enqueue(5)
queue.enqueue(10)
queue.enqueue(20)
queue.dequeue()

queue.peek()

print(queue.is_empty())
class MyCircularQueue(object):

    def __init__(self, k):
        self.size = k
        self.queue = [None] * k
        self.head = -1
        self.tail = -1

    def enQueue(self, value):
        if self.isFull():
            return False
        if self.isEmpty():
            self.head = 0
        self.tail = (self.tail + 1) % self.size
        self.queue[self.tail] = value
        return True
    
    def deQueue(self):
        if self.isEmpty():
            return False
        if self.head == self.tail:
            self.head = -1
            self.tail = -1
        else:
            self.head = (self.head + 1) % self.size
        return True

    def Front(self):
        return -1 if self.isEmpty() else self.queue[self.head]

    def Rear(self):
        return -1 if self.isEmpty() else self.queue[self.tail]

    def isEmpty(self):
        return self.head == -1

    def isFull(self):
        return (self.tail + 1) % self.size == self.head

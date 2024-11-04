class StackElement:
    def __init__(self, val):
        self.value = val
        self.next = None

class Stack:
    def __init__(self):
        self.top = None
    def push(self, val):
        new_element = StackElement(val)
        current_top = self.top
        new_element.next = current_top
        self.top = new_element
        return self
    def peek(self):
        return self.top
    def pop(self):
        if not self.top:
            return None
        self.top = self.top.next
        return self.top
    def print_values(self):
        runner = self.top
        while runner is not None:
            print(runner.value)
            runner = runner.next
        return self
    def is_empty(self):
        return True if not self.top else False
    
stack = Stack()

stack.push(5)
stack.push(20)
stack.push(30)

stack.print_values()

stack.pop()

stack.print_values()
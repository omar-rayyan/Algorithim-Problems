class SLNode:
    def __init__(self, val):
        self.value = val
        self.next = None

class SList:
    def __init__(self):
        self.head = None
    def add_to_front(self, val): # Adding a node to the front, making it the new slist's head
        new_node = SLNode(val) # Creating the new node we want to add
        current_head = self.head # Storing the current head in a variable
        new_node.next = current_head # Defining the next node of our new node as the current head
        self.head = new_node # Defining the head of our list as our new node
        return self # We return self to allow for chaining
    def add_at_position(self, data, position):
        if position == 0: # Checking if the position wanted is the head of the node
            self.add_to_front(data) # Call our function that adds a node as the new head
            return self # We return self to allow for chaining
        new_node = SLNode(data) # Creating the new node we want to add
        runner = self.head # Making a runner (pointer) that we will keep moving until we are at the node right before the desired position
        count = 0 # A counter variable that will be used to verify that we have reached the desired position
        while runner and count < position - 1: # Checking if the runner is valid (that we haven't moved it too much to become out-of-bounds)
            # And checking if we arrived at the node right before the desired position
            runner = runner.next # We move our runner pointer by one position ahead
            count += 1 # We increment our counter variable
        if runner is None: # We check if we are out-of-bounds, meaning the position desired is outside the list, so we can't add at it
            return False # Then exit the function and return False.
        new_node.next = runner.next # We make the node in the place next to our runner (it's at the desired position) as the next node for our new node
        runner.next = new_node # We store our new node in the 'next' value of our runner, as it comes right before the position.
        # This way we have completely inserted the node at the desired position
        return self # we return self to allow for chaining
    


# Examples

# Create the linked list
my_list = SList()

# Adding nodes to the front
my_list.add_to_front(10) # Teach them chaining
my_list.add_to_front(20)
my_list.add_to_front(30)

# Printing the list
print("List after adding nodes to the front:")
runner = my_list.head
while runner:
    print(runner.value, end=" -> ")
    runner = runner.next
print("None")

# Adding nodes at specific positions
my_list.add_at_position(15, 1)  # Adding 15 at position 1
my_list.add_at_position(25, 3)  # Adding 25 at position 3
my_list.add_at_position(35, 5)  # Adding 35 at position 5

# Print the list after inserting nodes at specific positions
print("List after adding nodes at specific positions:")
runner = my_list.head
while runner:
    print(runner.value, end=" -> ")
    runner = runner.next
print("None")
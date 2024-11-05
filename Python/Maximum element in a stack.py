def getMax(operations):
    stack = []
    max_stack = []
    result = []
    for operation in operations:
        if operation.startswith("1"):
            _, x = operation.split()
            x = int(x)
            stack.append(x)
            if max_stack:
                max_stack.append(max(x, max_stack[-1]))
            else:
                max_stack.append(x)
        elif operation == "2":
            if stack:
                stack.pop()
                max_stack.pop()
        elif operation == "3":
            if max_stack:
                result.append(max_stack[-1])
    return result
def countingValleys(steps, path):
    z = 0
    valleys_traversed = 0
    in_a_valley = False
    for step in path:
        if step == "U":
            z += 1
            if z == 0 and in_a_valley:
                valleys_traversed += 1
                in_a_valley = False
        else:
            z -= 1
            if z < 0 and not in_a_valley:
                in_a_valley = True
    return valleys_traversed
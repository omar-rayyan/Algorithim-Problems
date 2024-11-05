def staircase(n):
    stairs_built = 0
    while stairs_built < n:
        output_string = ""
        stairs_built += 1
        for spaces in range(n - stairs_built):
            output_string += " "
        for hashtags in range(stairs_built):
            output_string += "#"
        print(output_string)

staircase(5)
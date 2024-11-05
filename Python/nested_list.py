if __name__ == '__main__':
    students = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append([name, score])
    lowest_grade = None
    second_lowest_grade = None
    lowest_grade_list = []
    second_lowest_grade_list = []
    for student_data in students:
        if lowest_grade == None:
            lowest_grade = student_data[1]
            lowest_grade_list.append(student_data[0])
            continue
        if student_data[1] < lowest_grade:
            second_lowest_grade = lowest_grade
            second_lowest_grade_list = lowest_grade_list[:]
            lowest_grade = student_data[1]
            lowest_grade_list = []
            lowest_grade_list.append(student_data[0])
            continue
        if student_data[1] == lowest_grade:
            lowest_grade_list.append(student_data[0])
            continue
        if second_lowest_grade == None:
            second_lowest_grade = student_data[1]
            second_lowest_grade_list.append(student_data[0])
            continue
        if student_data[1] < second_lowest_grade:
            second_lowest_grade = student_data[1]
            second_lowest_grade_list = []
            second_lowest_grade_list.append(student_data[0])
            continue
        if student_data[1] == second_lowest_grade:
            second_lowest_grade_list.append(student_data[0])
            continue
    second_lowest_grade_list.sort()
    for student in second_lowest_grade_list:
        print(student)
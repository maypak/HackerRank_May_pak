if __name__ == '__main__':
    students = []
    grades = []
    names = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append([name,score])
        grades.append(score)
        continue
    
    grades = sorted(set(grades))[1]
    
    for i,j in students:
        if(j==grades):
            names.append(i)
            continue
    names.sort()
    for i in names:
        print(i)
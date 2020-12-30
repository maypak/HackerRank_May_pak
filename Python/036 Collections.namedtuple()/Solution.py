from collections import namedtuple

Student = namedtuple('Student', 'ID MARKS CLASS NAME')
s = []
n = int(input())

for i in range(n+1):
    if not i:
        _ = list((map(str, input().split())))
        ID = _.index('ID')
        MARKS = _.index('MARKS')
        CLASS = _.index('CLASS')
        NAME = _.index('NAME')
    else:
        _ = list((map(str, input().split())))
        s.append(Student(_[ID], _[MARKS], _[CLASS], _[NAME]))

print('{0:.2f}'.format(sum([int(i.MARKS) for i in s])/len(s)))
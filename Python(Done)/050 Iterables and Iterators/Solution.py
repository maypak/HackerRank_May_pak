from itertools import combinations

main_input = input()
listValue = input().split()
comboValue = input()

a = list(combinations(listValue,int(comboValue)))
final  = len(a)
count = 0
for i in a:
    if "a" in i:
        count +=1

print("{:3f}".format(count/final))
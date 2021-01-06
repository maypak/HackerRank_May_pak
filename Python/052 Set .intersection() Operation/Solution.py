n = int(input())
arrList1 = list(map(int,input().split(' ')))
m = int(input())
arrList2 = list(map(int,input().split(' ')))
count = 0
for i in range(len(arrList1)):
    if arrList1[i] in arrList2:
        count += 1
print(count)
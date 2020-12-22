n,m =input().split()
arr = input().split()
A = set(input().split())
B = set(input().split())

happiness = 0

for i in arr:
        if i in A:
                happiness +=1
        elif i in B:
                happiness -=1
        else:
                continue

print(happiness)
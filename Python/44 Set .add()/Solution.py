N = int(input())

arr = []

for _ in range(N):
    arr.append(input())

print(len(set(arr)))
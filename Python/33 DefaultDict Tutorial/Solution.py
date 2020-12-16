from collections import defaultdict

n, m = map(int, input().split())
d = defaultdict(list)

for i in range(1, n+1):
    d[input()].append(str(i))

for i in range(m):
    lst = d[input()]
    print(" ".join(lst)) if lst else print("-1")
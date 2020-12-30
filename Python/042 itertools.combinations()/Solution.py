from itertools import combinations

s, n = input().split()

print(*[''.join(i) for j in range(1, int(n)+1)
        for i in combinations(sorted(s), j)], sep='\n')
from collections import Counter

num_groups = input()

s1 = Counter(map(int, input().split()))

for key in s1:
    if s1[key] == 1:
        print(key)
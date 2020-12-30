from itertools import permutations
S,N = input().split()
for i in list(sorted(permutations(S,int(N)))):
    print(''.join(i))
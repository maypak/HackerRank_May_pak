import itertools

k,m=list(map(int,input().split(' ')))
d={}

for i in range(k):
    d["n{}".format(i)]=list(map(int,input().split(' ')[1:]))

prod=itertools.product(*d.values())

def our_condition(x):
    return sum([i**2 for i in x])%m

print(int(sorted(map(our_condition,prod))[-1]))
import numpy as np

np.set_printoptions(legacy='1.13')

n = tuple(map(int, input().strip().split(" ")))

x = np.eye(n[0],n[1])

print(x)
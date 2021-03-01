import numpy as np

N = np.array([input().split()],int)
print(np.zeros((*(x for x in N)), dtype = np.int))
print(np.ones((*(x for x in N)), dtype = np.int))
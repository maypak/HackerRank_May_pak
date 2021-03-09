import numpy

a,b = list(map(int, input().split()))
A = numpy.array([input().split()for _ in range(a)], int)
print(max(numpy.min(A, axis=1)))
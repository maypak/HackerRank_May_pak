import numpy

n = int(input())
x = numpy.array([input().strip().split() for _ in range(n)],int)
y = numpy.array([input().strip().split() for _ in range(n)],int)
print(numpy.dot(x,y))
import numpy

N,M = input().split()

lst = []
for i in range(int(N)):
    lst.append(input().split())

array = numpy.array(lst, int)
row_sum = numpy.sum(array, axis = 0)
print(numpy.prod(row_sum))
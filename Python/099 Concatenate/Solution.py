import numpy



k = list(map(int, input().split()))
d = []
for i in range(k[0]+k[1]):
    n = list(map(int, input().split()))
    d.append([n])
array1 = numpy.array(d)
print (numpy.concatenate(array1, axis = 0))
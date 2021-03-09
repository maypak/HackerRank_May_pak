import numpy

numpy.set_printoptions(legacy='1.13')
n = input().split(" ")
x = numpy.array(n,float)
print(numpy.floor(x), numpy.ceil(x), numpy.rint(x), sep="\n")
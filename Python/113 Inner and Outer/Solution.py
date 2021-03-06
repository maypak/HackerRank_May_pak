import numpy


a, b = numpy.array(input().split(), int), numpy.array(input().split(), int)
print(numpy.inner(a,b))
print(numpy.outer(a,b))
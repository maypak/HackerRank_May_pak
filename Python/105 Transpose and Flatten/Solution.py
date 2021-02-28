import numpy

arr = input().strip().split(' ') #first taking N,M as input

N = int(arr[0])
M = int(arr[1])
arr2=[]

for i in range(N):
    arr2.append(input().strip().split(' '))  
        #this has the NxM matrix as characters

np_arr = numpy.array(arr2,int)

np_arr.shape= (N,M)
print(numpy.transpose(np_arr))
print(np_arr.flatten())
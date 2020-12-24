def symm(a,b):
    myset = set()
    final = []
    c=0
    for x in range(2):
        myset.update(set(a).difference(set(b)))
        c = a
        a = b
        b = c
    final = sorted(list(myset))
    #print(final)
    for each in final:
        print(each)
            

if __name__ == '__main__':
    n = int(input())
    arr1 = list(map(int, input().split()))
    m = int(input())
    arr2 = list(map(int,input().split()))
    result = symm(arr1,arr2)
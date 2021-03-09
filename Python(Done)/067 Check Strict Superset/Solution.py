def superset(A,test):
    
    for i in range(len(test)):
        if A==test[i]:
            return False
        if A.issuperset(test[i])==False:
            return False
        
    return True

        
A=set(map(int,input().split()))
n=int(input())
test=[]

for i in range(n):
    test.append(set(map(int,input().split())))

    
result=superset(A,test)
    
print(result)
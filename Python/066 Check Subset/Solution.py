def subset(arr1,arr2):
    a1=set(arr1)
    a2=set(arr2)
    
    ans=a1.intersection(a2)
    
    if len(ans)==len(a1):
        return True
    else:
        return False

n=int(input())
        
for i in range(n):
    a=input()
    arr1=list(map(int,input().split()))
    b=input()
    arr2=list(map(int,input().split()))
    
    result=subset(arr1,arr2)
    
    print(result)
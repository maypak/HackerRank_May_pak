if __name__ == '__main__':
    N = int(input())
    list_value=[]
    for i in range(N):
        query= input().split()
        if (query[0]=="print"):
            print(list_value)
        elif(query[0]=="insert"):
            list_value.insert(int(query[1]),int(query[2]))
        elif(query[0]=="remove"):
            list_value.remove(int(query[1]))
        elif(query[0]=="append"):
            list_value.append(int(query[1]))
        elif(query[0]=="pop"):
            list_value.pop()
        elif(query[0]=="reverse"):
            list_value.reverse()
        elif(query[0]=="sort"):
            list_value= sorted(list_value)
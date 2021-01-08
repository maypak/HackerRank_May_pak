for item in range (int(input())):
    item, queue = input(), list(map(int, input().split()))
    if (queue[-1] == max(queue)) or (queue[0] == max(queue)):
        print ("Yes")
    else:
        print ("No")
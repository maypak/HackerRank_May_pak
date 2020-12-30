test = int(input())
while test:
    try:
        a, b = map(int, input().split())
        print(a//b)
    except Exception as e:
        print("Error Code: {}".format(e))
    test -= 1
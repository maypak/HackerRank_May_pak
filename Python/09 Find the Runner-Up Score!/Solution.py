if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    lt = list(arr) 
    lt = list(dict.fromkeys(lt))
    lt.sort() 
    print(lt[len(lt)-2])
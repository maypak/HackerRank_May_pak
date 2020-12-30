def merge_the_tools(string, k):
    stringlist = [string[i:i+k] for i in range(0, len(string), k)]

    for substr in stringlist:
        print("".join(dict.fromkeys(substr)))
    
if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
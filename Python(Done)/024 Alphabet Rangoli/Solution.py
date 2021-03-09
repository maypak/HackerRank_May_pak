def print_rangoli(size):
    for i in range(1, size*2):
        for j in range(1, size*2):
            r = abs(size - j) + abs(size - i)
            print(chr(97+r) if r<size else "-",
                  end="\n" if j==size*2-1 else "-")

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
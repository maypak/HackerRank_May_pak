def split_and_join(line):
    t = line.split(" ")
    t = '-'.join(t)
    return t

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)
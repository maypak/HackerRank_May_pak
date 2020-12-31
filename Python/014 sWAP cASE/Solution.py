def swap_case(s):
    newstring = ''
    for x in s:
        if x.isupper():
            newstring += x.lower()
        else:
            newstring += x.upper()
                     
    return  newstring

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
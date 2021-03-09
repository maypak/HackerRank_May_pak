if __name__ == '__main__':
    s = input()
    print(len([True for i in s if i.isalnum()]) > 0 )
    print(len([True for i in s if i.isalpha()]) > 0 )
    print(len([True for i in s if i.isdigit()]) > 0 )
    print(len([True for i in s if i.islower()]) > 0 )
    print(len([True for i in s if i.isupper()]) > 0 )
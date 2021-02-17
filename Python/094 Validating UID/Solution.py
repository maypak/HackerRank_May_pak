from re import *

reg = compile(r'^(?!.*(.)\1)(?=.*[0-9]{3})(?=.*[A-Z]{2})[a-zA-Z0-9]{10}$')
for i in range(int(input())):
    string = ''.join(sorted(input()))
    a = search(reg, string)
    if a:
        print('Valid')
    else:
        print('Invalid')
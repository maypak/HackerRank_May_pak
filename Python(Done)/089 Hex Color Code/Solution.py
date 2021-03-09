from re import *

a = r'(?<![\w])(#[a-f\d]{3}|#[a-f\d]{6})(?=[;,)])'
for i in range(int(input())):
    b = input()
    c = findall(a, b, I)
    if c:
        print(*c, sep='\n')
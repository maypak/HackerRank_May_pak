from re import *

username = r'([a-z][\w+-._]+)'
domain = r'([a-z]+)'
extension = r'([a-z]{1,3})'
reg = '^<' + username + '@' + domain + r'\.' + extension + '>$'
for i in range(int(input())):
    a, b = input().split()
    if match(reg, b):
        print(a, b)
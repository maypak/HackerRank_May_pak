import re

n = int(input())
fn = re.compile(r'^[+-]?\d*\.\d+$')

for i in range(n):
    print(True) if fn.search(input()) else print(False)
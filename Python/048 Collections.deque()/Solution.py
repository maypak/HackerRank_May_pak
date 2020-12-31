from collections import deque

n = int(input())

lst = deque()

for i in range(n):
    cmd = input().split()
    if len(cmd) == 2:
        eval('lst.' + cmd[0] + '(' + cmd[1] + ')')
    else:
        eval('lst.' + cmd[0] + '()')

print(*lst)
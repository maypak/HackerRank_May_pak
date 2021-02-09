import re
N = int(input())
for i in range(N):
    ph = input()
    if re.fullmatch("[789][0-9]{9}", ph):
        print("YES")
    else:
        print("NO")  
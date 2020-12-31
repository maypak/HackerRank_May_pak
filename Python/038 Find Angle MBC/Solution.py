import math
ab = int(input())
bc = int(input())
print(round(math.degrees(math.atan(ab/bc))), end='')
print(u'\N{DEGREE SIGN}')
import re

regex = '[aeiouAEIOU]{2,}[QWRTYPSDFGHJKLZXCVBNMqwrtypsdfghjklzxcvbnm]{1}'

S = input()

[print(x[:-1]) for x in re.findall(regex, S)]

if re.findall(regex, S) == []:
    print(-1)
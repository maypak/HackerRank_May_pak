import re
pattern=re.compile(r'([a-z0-9])\1+')
m=pattern.search(input())
print(m.group(1) if m else -1)
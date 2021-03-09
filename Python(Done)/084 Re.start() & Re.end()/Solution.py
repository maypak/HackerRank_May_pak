import re
S,K=(input().split() for _ in range(2))
pattern=re.compile(*K)
r=pattern.search(*S)
if not r: print("(-1, -1)")
while r:
    print("({}, {})".format(r.start(),r.end()-1))
    r=pattern.search(*S,r.start()+1)
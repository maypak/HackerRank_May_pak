upper,lower,odd,even = [],[],[],[]
for c in sorted(input()):
    (c.islower() and lower.append(c)) or \
    (c.isupper() and upper.append(c)) or \
    (c.isdigit() and int(c)%2!=0 and odd.append(c)) or \
    (c.isdigit() and int(c)%2==0 and even.append(c))

print("".join(lower + upper + odd + even))
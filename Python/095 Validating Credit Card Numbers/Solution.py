import re
for i in range(int(input())):
        a = input()
        if re.match(r'^[456]{1}\d{3}\-?\d{4}\-?\d{4}\-?\d{4}$', a):
                b = re.sub('-', '', a)
                c = re.findall(r'((\d)\2{3,})', b)
                print('Valid' if len(c) == 0 else "Invalid")
        else:
                print('Invalid')
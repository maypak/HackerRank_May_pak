import re
pattern=re.compile(r'(?<= )(&&|\|\|)(?= )')
print('\n'.join(pattern.sub(lambda x: 'and' if x.group()=='&&' else 'or',input()) for _ in range(int(input()))))
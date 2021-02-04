from fractions import Fraction
from functools import reduce

def product(fracs):
    t = Fraction(reduce((lambda x, y : x * y),[i.numerator for i in fracs]),\
                 reduce((lambda x, y : x * y),[i.denominator for i in fracs]))
    return t.numerator, t.denominator

if __name__ == '__main__':
    fracs = []
    for _ in range(int(input())):
        fracs.append(Fraction(*map(int, input().split())))
    result = product(fracs)
    print(*result)
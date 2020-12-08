#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(s):
    new_s = [' '] + [*s]
    for i in range(1, len(new_s)):
        if new_s[i-1].isspace():
            new_s[i] = new_s[i].upper()
    return ''.join(new_s[1:])

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = solve(s)

    fptr.write(result + '\n')

    fptr.close()

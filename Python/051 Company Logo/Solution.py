#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    s = input()
    dic = {}
    for val in s:
        if val in dic.keys(): dic[val]+=1
        else: dic[val]=1
        
    dic_sort = sorted(dic.items(),key=lambda x:(-x[1],x[0]))
    for i in range(3): print(str(dic_sort[i][0])+' ' + str(dic_sort[i][1]))
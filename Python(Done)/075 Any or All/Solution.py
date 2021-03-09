N, lst = input(), input().split()

print(all(int(num)>0 for num in lst) and any(num == num[::-1] for num in lst))
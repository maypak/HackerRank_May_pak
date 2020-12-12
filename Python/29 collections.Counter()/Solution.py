from collections import Counter

x = int(input())  # number of shoes
sizes = Counter(map(int, input().split()))
customer = int(input())

# x, sizes, customer = int(input()), Counter(map(int, input().split())), int(input())

t_price = 0

for _ in range(customer):
    size, price = map(int, input().split())
    if sizes[size]:
        t_price += price
        sizes[size] -= 1

print(t_price)
number_elements_A = int(input())
set_A = set(map(int, input().split()))
number_instructions = int(input())

for j in range(number_instructions):
    instruction = input().split()
    set_B = set(map(int, input().split()))
    in1 = 'set_A.{C}(set_B)'.format(C = instruction[0])
    eval(in1)

print(sum(set_A))
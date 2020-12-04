n, N = input().split()
design_counter, main_design, text = 1, ".|.", "WELCOME"
for i in range(1, int(n) + 1):
    if i == ((int(n) - 1) // 2) + 1:
         print("{0}".format(text).center(int(N), '-'))
    else:
         print("{0}".format(main_design * design_counter).center(int(N), '-'))
    
    if i >= ((int(n) - 1) // 2) + 1:
        design_counter -= 2 
    else:
         design_counter += 2
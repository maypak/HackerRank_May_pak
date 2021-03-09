regex_integer_in_range = r"^[100000-999999]{6}$"	# Do not delete 'r'.
regex_alternating_repetitive_digit_pair = r"(\d)(?=(\d)\1)"	# Do not delete 'r'.



import re
P = input()

print (bool(re.match(regex_integer_in_range, P)) 
and len(re.findall(regex_alternating_repetitive_digit_pair, P)) < 2)
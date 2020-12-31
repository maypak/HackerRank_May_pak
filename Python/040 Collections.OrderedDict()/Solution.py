from collections import OrderedDict

ordered_dictionary = OrderedDict()

for i in range(int(input())):
    *k,v=input().split()
    k=' '.join(k)
    if(k not in ordered_dictionary):
        ordered_dictionary[k]=int(v)
    else:        
        ordered_dictionary[k]+=int(v)
    
for k,v in ordered_dictionary.items():
    print(k,v)
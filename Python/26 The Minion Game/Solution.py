def minion_game(string):
    vowel = ['A','E','I','O','U']
    length = len(string)
    Kevin  = 0
    Stuart = 0
    index = -1
    for each_letter in list(string):
        index += 1
        if each_letter in vowel:
            Kevin +=(length - index)
        else:
            Stuart += (length - index)
           
        
    if Kevin > Stuart :
        print("Kevin {}".format(Kevin) )
    elif Stuart>Kevin:
        print("Stuart {}".format(Stuart))
    else:
        print("Draw")
    

if __name__ == '__main__':
    s = input()
    minion_game(s)
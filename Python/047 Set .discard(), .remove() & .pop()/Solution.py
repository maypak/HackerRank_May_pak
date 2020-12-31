n = int(input())
s = set(map(int, input().split()))
times=int(input())

def LetsDiscard(x:int):
    s.discard(x)
def LetsPop():
    s.pop()
def LetsRemove(x:int):
    s.remove(x) 


for i in range(0,times):
    action = list(input().split())
    if "discard" in action:
        LetsDiscard(int(action[1]))
    elif "remove" in action:
        LetsRemove(int(action[1]))
    elif "pop" in action:
        LetsPop()
        
print(sum(s))  
x,y = map(int, input().split())
if(x == 0 and y == 1): print("ALL GOOD")
elif(x != 0 and y == 1): print("IMPOSSIBLE")
else: print(x/(1-y))
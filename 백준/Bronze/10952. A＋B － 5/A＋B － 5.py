run = True
while(run):
    A, B = map(int, input().split())
    if A == 0 and B == 0:
        run = False
    else:
        print(A + B)
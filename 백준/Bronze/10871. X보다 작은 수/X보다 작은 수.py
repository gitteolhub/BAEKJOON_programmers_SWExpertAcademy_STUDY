N, X = map(int, input().split())
seq = list(map(int, input().split()))
for i in seq:
    if X > i:
        print(i, end = " ")
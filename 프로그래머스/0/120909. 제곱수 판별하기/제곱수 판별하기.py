def solution(n):
    answer = 0
    sqrt = round (n**0.5)
    if sqrt * sqrt == n:
        answer = 1
    else:
        answer = 2
    return answer
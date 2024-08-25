def solution(n):
    answer = 0
    sqrt = int (round (n**0.5))
    answer = 1 if sqrt * sqrt == n else 2
    return answer
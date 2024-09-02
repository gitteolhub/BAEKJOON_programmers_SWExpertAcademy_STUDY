def solution(hp):
    answer = 0
    a = hp // 5
    b = (hp - hp // 5 * 5) // 3
    c = (hp - hp // 5 * 5) % 3
    answer = a + b + c
    return answer
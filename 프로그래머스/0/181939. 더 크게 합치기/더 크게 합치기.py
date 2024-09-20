def solution(a, b):
    result1 = int(str(a) + str(b))
    result2 = int(str(b) + str(a))
    return max(result1, result2)
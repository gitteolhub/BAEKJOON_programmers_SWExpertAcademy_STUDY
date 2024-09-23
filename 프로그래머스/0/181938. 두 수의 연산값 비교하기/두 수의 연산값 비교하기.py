def solution(a, b):
    calc1 = int(str(a) + str(b))
    calc2 = 2 * a * b
    return max(calc1, calc2)
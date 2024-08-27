def solution(money):
    answer = [0] * 2
    answer[0], answer[1] = divmod(money, 5500)
    return answer
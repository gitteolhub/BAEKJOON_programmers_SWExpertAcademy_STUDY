def solution(n, control):
    answer = n
    move = {
        'w' : 1,
        'a' : -10,
        's' : -1,
        'd' : 10
    }
    for i in control:
        answer += move[i]
    return answer
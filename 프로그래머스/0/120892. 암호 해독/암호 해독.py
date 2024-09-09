def solution(cipher : str, code : int) -> str:
    answer = cipher[code - 1 :: code]
    return answer
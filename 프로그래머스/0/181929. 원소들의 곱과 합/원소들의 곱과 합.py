def solution(num_list):
    product = 1
    plus_square = sum(num_list) ** 2
    for num in num_list:
        product *= num
    return 1 if product < plus_square else 0
function solution(num_list) {
    var answer = 0;
    let product = num_list.reduce((acc, i) => acc * i, 1);
    let sum = num_list.reduce((acc, i) => acc + i, 0);
    let sum_squared = sum * sum;
    if (product < sum_squared) {
        answer = 1;
    }
    return answer;
}
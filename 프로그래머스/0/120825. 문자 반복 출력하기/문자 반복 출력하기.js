function solution(my_string, n) {
    var answer = '';
    for (let ms of my_string) {
        answer += ms.repeat(n);
    }
    return answer;
}
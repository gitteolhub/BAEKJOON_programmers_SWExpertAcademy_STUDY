function solution(n) {
    var answer = 0;
    let sqrt = parseInt(Math.round(Math.sqrt(n)));
    answer = sqrt * sqrt === n ? 1 : 2;
    return answer;
}
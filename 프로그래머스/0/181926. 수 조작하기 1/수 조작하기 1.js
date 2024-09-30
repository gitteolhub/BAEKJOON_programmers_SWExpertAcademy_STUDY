function solution(n, control) {
    var answer = n;
    const move = {
        'w' : 1,
        'a' : -10,
        's' : -1,
        'd' : 10
    };
    for (let con of control) {
        answer += move[con];
    }
    return answer;
}
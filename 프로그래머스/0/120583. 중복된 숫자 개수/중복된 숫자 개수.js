function solution(array, n) {
    var answer = array.filter(item => item === n).length;
    return answer;
}
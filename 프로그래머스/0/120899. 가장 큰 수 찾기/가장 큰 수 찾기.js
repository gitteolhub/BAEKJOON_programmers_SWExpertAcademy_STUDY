function solution(array) {
    var answer = [];
    let max = array[0];
    let index = 0;
    for (let i = 1; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
            index = i;
        }
    }
    answer[0] = max;
    answer[1] = index;
    return answer;
}
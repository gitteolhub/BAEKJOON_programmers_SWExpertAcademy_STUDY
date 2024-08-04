function solution(numbers) {
    var answer = 0;
    let n = numbers.length;
    let sum = 0;
    for (let number of numbers){
        sum += number;
    }
    answer = sum/n;
    return answer;
}
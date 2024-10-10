function solution(my_string, index_list) {
    var answer = '';
    for (let il of index_list) {
        answer += my_string[il];
    }
    return answer;
}
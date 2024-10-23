function solution(s1, s2) {
    var answer = 0;
    let repo = new Set();
    for (let s of s1) {
        repo.add(s);
    }
    for (let ss of s2) {
        if (repo.has(ss)) {
            answer += 1;
        }
    }
    return answer;
}
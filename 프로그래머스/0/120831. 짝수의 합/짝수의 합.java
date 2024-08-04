class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int number = 0; number <= n; number = number + 2){
            answer += number;
        }
        return answer;
    }
}
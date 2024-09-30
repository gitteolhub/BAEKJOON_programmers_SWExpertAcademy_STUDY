class Solution {
    public int solution(int n, String control) {
        int answer = n;
        for (char con : control.toCharArray()) {
            if (con == 'w') {
                answer += 1;
            }
            else if (con == 'a') {
                answer -= 10;
            }
            else if (con == 's') {
                answer -= 1;
            }
            else {
                answer += 10;
            }
        }
        return answer;
    }
}
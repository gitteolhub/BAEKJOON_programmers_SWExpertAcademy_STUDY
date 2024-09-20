class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int product = 1;
        int sum_squared = 0;
        for (int num : num_list) {
            sum_squared += num;
            product *= num;
        }
        sum_squared = sum_squared * sum_squared;
        if (product < sum_squared) {
            answer = 1;
        }
        return answer;
    }
}
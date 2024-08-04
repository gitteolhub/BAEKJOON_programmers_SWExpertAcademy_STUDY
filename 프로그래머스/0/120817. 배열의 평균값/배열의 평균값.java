class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int n = numbers.length;
        double sum = 0;
        for (int number : numbers){
            sum += number;
        }
        answer = sum/n;
        return answer;
    }
}
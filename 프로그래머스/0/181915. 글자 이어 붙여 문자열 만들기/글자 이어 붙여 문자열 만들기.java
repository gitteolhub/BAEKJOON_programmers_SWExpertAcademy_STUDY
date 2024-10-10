class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for (int il : index_list) {
            answer += my_string.toCharArray()[il];
        }
        return answer;
    }
}
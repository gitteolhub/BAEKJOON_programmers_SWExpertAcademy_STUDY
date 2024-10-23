import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        HashSet<String> repo = new HashSet<>();
        for (String s : s1) {
            repo.add(s);
        }
        for (String ss : s2) {
            if (repo.contains(ss)) {
                answer += 1;
            }
        }
        return answer;
    }
}
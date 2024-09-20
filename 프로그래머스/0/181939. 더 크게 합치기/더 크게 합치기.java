class Solution {
    public int solution(int a, int b) {
        String result1 = String.valueOf(a) + String.valueOf(b);
        String result2 = String.valueOf(b) + String.valueOf(a);
        if (Integer.parseInt(result1) >= Integer.parseInt(result2)) {
            return Integer.parseInt(result1);
        }
        else {
            return Integer.parseInt(result2);
        }
    }
}
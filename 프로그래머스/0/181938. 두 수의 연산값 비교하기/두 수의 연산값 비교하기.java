class Solution {
    public int solution(int a, int b) {
        int calc1 = Integer.parseInt("" + a + b);
        int calc2 = 2 * a * b;
        return Math.max(calc1, calc2);
    }
}
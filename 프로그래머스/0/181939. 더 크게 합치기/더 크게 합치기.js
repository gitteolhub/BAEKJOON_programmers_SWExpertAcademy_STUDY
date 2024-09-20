function solution(a, b) {
    const rst1 = Number("" + a + b);
    const rst2 = Number("" + b + a);
    return Math.max(rst1, rst2);
}
function solution(a, b) {
    let calc1 = Number("" + a + b);
    let calc2 = 2 * a * b;
    return Math.max(calc1, calc2);
}
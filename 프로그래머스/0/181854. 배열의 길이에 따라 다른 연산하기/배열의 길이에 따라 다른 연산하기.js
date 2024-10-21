function solution(arr, n) {
    for (let i = arr.length % 2 !== 0 ? 0 : 1; i < arr.length; i += 2) {
        arr[i] += n;
    }
    return arr;
}
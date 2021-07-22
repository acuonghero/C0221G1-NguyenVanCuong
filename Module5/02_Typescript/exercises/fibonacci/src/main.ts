function fibonacci(n: number): number {
    if (n < 0) {
        return 0;
    } else if (n == 0 || n == 1) {
        return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
let num =10;
let sum = 0;
for(let i = 0 ; i<=num;i++){
    sum+=fibonacci(i);
}
console.log("Tổng 10 số đầu tiên của dãy fibonacci : " + sum);
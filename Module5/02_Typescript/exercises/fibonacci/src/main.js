function fibonacci(n) {
    if (n < 0) {
        return 0;
    }
    else if (n == 0 || n == 1) {
        return n;
    }
    else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
var num = 10;
var sum = 0;
for (var i = 0; i <= num; i++) {
    sum += fibonacci(i);
}
console.log("Tổng 10 số đầu tiên của dãy fibonacci : " + sum);

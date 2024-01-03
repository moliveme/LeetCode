#include <stdio.h>

double rec(double x, int n) {

    if (n == 0) {
        return 1.00;
    }

    return (x * rec(x, n - 1));

}

double myPow(double x, int n){

    if (n < 0) {
        return (1.00 / rec(x, n * -1));
    }
    return rec(x, n);

}

int main() {
    printf("pow %lf\n", myPow(0.00001, 2147483647));
    return 0;
}
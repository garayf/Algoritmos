#include <stdio.h>
#include <iostream>
int fibonacci(int n){
    if(n==0) return 0;
    if(n==1) return 1;
    if(n>1) return fibonacci(n-1)+fibonacci(n-2);
}
using namespace std;

int main(void) {
    int r = fibonacci(47);
    cout << ("res: %i",r);
    // your code goes here
    return 0;
}

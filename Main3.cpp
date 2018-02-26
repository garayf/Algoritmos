#include <stdio.h>
#include <iostream>

using namespace std;

int main(void) {
    long n,a,b;
    int i;
	a=1;
    b=2;
    
	cout << "ingrese el numero"<< endl;
	cin>>n;
	
	for(i=1;i<=n-3;i++){
	b = a+b;
	a = b-a;	
		
	}
	
    cout << a<<endl;
    cout <<"el valor del overflow es de 93 "<<endl;
    // your code goes here
    return 0;
}

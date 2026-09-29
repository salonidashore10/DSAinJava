#include<iostream>
using namespace std;
int main(){

    int n;
    int newFibonacciNum=0;
    cout<<"Enter the number of terms : ";
    cin>>n;

    cout<<"Your Fibonacci Series is: ";
    int a=0;
    cout<<a<<" ";
    int b=1;
    cout<<b<<" ";

    for(int i=0;i<n;i++){
        newFibonacciNum=a+b;
        a=b;
        b=newFibonacciNum;
        cout<<newFibonacciNum<<" ";
    }
    return 0;
}
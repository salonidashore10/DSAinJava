#include<iostream>
using namespace std;

int getSecondLargest(int *arr, int n) {
    // code here
    // int max=arr[0];
    // for(int i=0;i<n;i++){
    //     if(arr[i] > max){
    //         max=arr[i];
    //     }
    //     // return max;
    // }
    // int secondMax=arr[0];
    // for(int i=0;i<n;i++){
    //     if(arr[i]>secondMax && arr[i]<max){
    //         secondMax=arr[i];
    //     }
    //     return secondMax;
    // }
    // return -1;

    int max=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>max && arr[i]!=max){
            max=arr[i];
        }
    }
    cout<<max<<endl;
    int secondMax=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>secondMax && arr[i]<max && arr[i]!=max){
            secondMax=arr[i];
        }
    }
    cout<<secondMax;
}

int main(){
    int n;
    cout<<"Enter n:";
    cin>>n;
    int arr[n];
    cout<<"Enter array elements: ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    getSecondLargest(arr,n);
    return 0;
}
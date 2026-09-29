import java.util.Scanner;

public class ReversepartofArray {
    public static void main(String[] args) {
        int[] arr={1,12,23,45,56,78,89,23};
        int n=arr.length;

        // Reversed part of array from 23 to 78
        int i=2,j=n-3;
        while (i<j) {
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
        System.out.print("Reversed array : ");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
}

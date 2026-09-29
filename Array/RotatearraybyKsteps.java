import java.util.Scanner;

public class RotatearraybyKsteps {
    public static void main(String[] args) {
        int[] arr={12,13,14,23,45,56,67};
        int n=arr.length;

        // Roatate array by k=5 steps
        int i=0,j=n-1;
        while (i<j) {
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
        int l=2,m=n-1;
        while (l<m) {
            arr[l]=arr[l]+arr[m];
            arr[m]=arr[l]-arr[m];
            arr[l]=arr[l]-arr[m];
            l++;
            m--;
        }
        int o=0,p=1;
        while (o<p) {
            arr[o]=arr[o]+arr[p];
            arr[p]=arr[o]-arr[p];
            arr[o]=arr[o]-arr[p];
            o++;
            p--;
        }
        System.out.print("Reversed array : ");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
}

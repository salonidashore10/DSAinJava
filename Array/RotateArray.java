public class RotateArray {
    
    public static void Reverse(int[] arr,int n,int i,int j) {
        while(i<j){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr={12,13,14,23,45,56,67};
        int n=arr.length;

        // Roatate array by k=5 steps

        Reverse(arr,n, 0, n-1);
        Reverse(arr,n, 2, n-1);
        Reverse(arr,n, 0, 1);

        System.out.print("Reversed array : ");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
}

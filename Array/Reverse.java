import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Given Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        // Reversed array
        int i=0,j=n-1;
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

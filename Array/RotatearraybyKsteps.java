import java.util.Scanner;

public class RotatearraybyKsteps {

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
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        System.out.println("Enter elements of array : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Given Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();

        // Roatate array by k steps

        System.out.print("Enter 'K' ( no. of rotations you want ) : ");
        int k=sc.nextInt();
        k=k%n;

        Reverse(arr,n, 0, n-k-1);
        Reverse(arr,n, n-k, n-1);
        Reverse(arr,n, 0, n-1);

        System.out.print("Reversed array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

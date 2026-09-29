import java.util.Scanner;

public class copyArrayinReverse {
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

        // copy array in reverse

        int[] brr=new int[n];

        for(int i=0;i<n;i++){
            brr[i]=arr[n-i-1];
        }
        
        System.out.print("Reversed copied array : ");
        for(int i=0;i<n;i++){
            System.out.print(brr[i]+" ");
        }
    }
}

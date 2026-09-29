import java.util.Scanner;

public class sumofallEle {
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

        // Sum of elements
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of all elements in the given array : "+sum);
    }
}

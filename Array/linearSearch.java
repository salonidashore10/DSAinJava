import java.util.Scanner;

public class linearSearch {
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

        // linear search
        System.out.println("Enter your targeted element : ");
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println("Your target found on index : "+i);
            }
        }
    }
}

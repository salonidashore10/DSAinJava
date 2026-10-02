import java.util.Scanner;

public class findingMissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        System.out.println("Enter elements of array : ");
        int[] arr=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Given Array : ");
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();

        // find missing number in array
        int expectedSum=n*(n+1)/2;
        System.out.println("Expected Sum : "+expectedSum);
        int arraySum=0;
        for(int i=0;i<n-1;i++){
            arraySum+=arr[i];
        }
        System.out.println("Array Sum : "+arraySum);
        int missingNumber=expectedSum-arraySum;
        System.out.println(" Missing number is : "+missingNumber);
    }
}

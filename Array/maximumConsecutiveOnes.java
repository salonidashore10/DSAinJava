import java.util.Scanner;

public class maximumConsecutiveOnes {
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

        // printing the maximum number of continously appearing ones

        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                if(max<count){
                    max=count;
                }
            }
            if(arr[i]==0){
                count=0;
            }
        }
        System.out.println("Maximum Consecutive Ones in array : "+max);
    }
}

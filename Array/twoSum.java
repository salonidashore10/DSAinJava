import java.util.Scanner;

public class twoSum {
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

        // two sum means find the doublet whose sum is equal to the target
        System.out.println("Enter your targeted sum : ");
        int target=sc.nextInt();

        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if((arr[i]+arr[j])==target){
        //             System.out.println("Indices of the doublet : "+i+" , "+j);
        //         }
        //     }
        // }

        int[] newArr=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])==target){
                    newArr[0]=i;
                    newArr[1]=j;
                    break;
                }
            }
        }
        System.out.print("Indices of doublet : ");
        for(int i=0;i<2;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}

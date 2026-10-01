import java.util.Scanner;
import java.util.Vector;

public class intersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // 1st array
        System.out.print("Enter size of first array : ");
        int m=sc.nextInt();
        System.out.println("Enter elements of array : ");
        int[] arr=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("1st Array : ");
        for(int i=0;i<m;i++){
            System.out.print(arr[i]+" ");
        }

        // 2nd array
        System.out.print("Enter size of second array : ");
        int n=sc.nextInt();
        System.out.println("Enter elements of array : ");
        int[] brr=new int[n];
        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        System.out.print("2nd Array : ");
        for(int i=0;i<n;i++){
            System.out.print(brr[i]+" ");
        }
        
        System.out.println();

        // Union in two sorted array
        
        Vector<Integer> Union = new Vector<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==brr[j]){
                    Union.add(arr[i]);
                }
            }
        }
        System.out.println("Union of two arrays : "+Union);
    }
}

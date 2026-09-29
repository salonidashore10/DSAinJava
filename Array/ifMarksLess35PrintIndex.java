import java.util.Scanner;

public class ifMarksLess35PrintIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int n=sc.nextInt();
        System.out.println("Enter marks of students : ");
        int[] marks=new int[n];
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        System.out.print("Given marks : ");
        for(int i=0;i<n;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.print("roll number (indices) of students whose marks is less than 35 : ");
        int target=35;
        for(int i=0;i<n;i++){
            if(marks[i]<target){
                System.out.print(i+" , ");
            }
        }
    }
}

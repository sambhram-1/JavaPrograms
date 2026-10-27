import java.util.*;
public class Array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
         System.out.println("Enter Elements of array:");
         for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
         }
         System.out.println("Elements of array are:");
         for(int i=0;i<n;i++){
             System.out.printf("%d ",a[i]);
         }sc.close();
    }
}
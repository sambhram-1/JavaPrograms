import java.util.*;
public class ArrayLargestNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int a[]=new int[5];
        System.out.println("Enter Elements of array:"); 
        for(int i=0;i<5;i++){
                a[i]=sc.nextInt();
            }
        for(int i=0;i<5;i++){
        if(a[i]>a[i+1]){
            int temp=0;
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
         System.out.println("Elements of array are:");
         for(i=0;i<5;i++){
             System.out.printf("%d ",a[i]);
         }
         sc.close();}
int lar=a[0];
        for(int i=0;i<5;i++){
            if(a[i]> lar){
             lar=a[i];
            }
        }
    }
}


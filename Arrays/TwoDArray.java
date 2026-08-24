import java.util.*;
public class TwoDArray {
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int a[][]=new int[3][3];
         a[0][0]=1;
         a[0][1]=2;
         a[0][2]=3;
         a[1][0]=0;
         a[1][1]=1;
         a[1][2]=0;
         a[2][0]=3;
         a[2][1]=2;
         a[2][2]=1;
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println();
         }
        sc.close(); 
        }
}

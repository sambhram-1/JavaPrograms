import java.util.Scanner;
public class Multiplication {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1=sc.nextInt();
        int a;
        for(int i=1;i<=10;i++){ 
            a=num1*i;
            System.out.printf("%d\n",a);
        }sc.close();
    }
}

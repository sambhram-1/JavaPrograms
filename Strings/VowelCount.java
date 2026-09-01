package Strings;
import java.util.*;
public class VowelCount {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String A=sc.nextLine();
        A=A.toLowerCase();
        int count=0;
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                 count++;
            }
        }sc.close();
        System.out.print(count);
    }
}

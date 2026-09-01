package Strings;
import java.util.*;
public class StringCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        int upcount=0;
        int locount=0;
        int spcount=0;
        int digcount=0;
        for(int i=0;i<A.length();i++){
           char ch=A.charAt(i);
           if(Character.isUpperCase(ch)){
            upcount++;
           }else if(Character.isLowerCase(ch)){
            locount++;
           }else if(Character.isWhitespace(ch)){
            spcount++;
           }else if(Character.isDigit(ch)){
            digcount++;
           }  
        }
        System.out.printf("Uppercase: %d \n",upcount);  
        System.out.printf("Lowercase: %d \n",locount);  
        System.out.printf("Space: %d \n",spcount);  
        System.out.printf("Digits: %d \n",digcount);  
    sc.close();
    }
}

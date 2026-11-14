import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int n =s.length();
            if(n>10){
                char first=s.charAt(0);
                char second=s.charAt(n-1);
                int len=n-2;
                System.out.println(first+""+len+""+second);
            }
        else
            System.out.println(s);
        }
 
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int ans=0;
         for(int i=0;i<n;i++){
             String s=sc.next();
             char ch=s.charAt(1);
             if(ch=='+'){
                 ans++;
             }
             else{
                 ans--;
             }
         }  
         System.out.println(ans);     
    }    
}    
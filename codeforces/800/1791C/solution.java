import java.util.Scanner;
 
public class CPrependAndAppend{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
 
            if(n==0){
                System.out.println(0);
                continue;
            }
            int i=0,j=n-1;
            while(i<=j){
                if(s.charAt(i)=='0' && s.charAt(j)=='1'){
                    i++;
                    j--;
                }
                else if(s.charAt(i)=='1' && s.charAt(j)=='0'){
                    i++;
                    j--;
                }
                else{
                    break;
                }
            }
            if(i!=0 && j!=n-1)
            System.out.println(j-i+1);
            else{
                System.out.println(n);
            }
        }
    }
}
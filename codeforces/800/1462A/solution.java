import java.util.Scanner;
 
/**
 * AFavoriteSequence
 */
public class AFavoriteSequence {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            int i=0,j=n-1;
            int a=0;
            while(i<=j){
                if(a%2==0){
                    System.out.print(arr[i]+" ");
                    i++;
                }
                else{
                    System.out.print(arr[j]+" ");
                    j--;
                }
                a++;
            }
            System.out.println();
        }
    }
}
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int n=sc.nextInt();
        
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(max_partition(arr));
    }
    public static int max_partition(int[] arr){
        int n=arr.length;
        int ans=0;
        //prefix max
        int []left =new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        //suffix min
        int right[]=new int[n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.min(right[i+1],arr[i]);
        }
        for(int i=0;i<n-1;i++){
            if(left[i]<=right[i+1]){
               ans++;
            }
        }
        return ans+1;
    }
}
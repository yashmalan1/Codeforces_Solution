import java.util.*;
/**
 * BKuriyamaMiraiSStones
 */
public class BKuriyamaMiraiSStones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        
        long prefix[]=new long[n+1];
        for(int i=1;i<=n;i++){
            prefix[i]=arr[i-1]+prefix[i-1];
        }
        
        long sorted_Prefix[]=new long[n+1];
        Arrays.sort(arr);
        for(int i=1;i<=n;i++){
            sorted_Prefix[i]=sorted_Prefix[i-1]+arr[i-1];
        }
        
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int type=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            long ans=0;
            if(type==1){
                ans=prefix[r]-prefix[l-1];
            }
            else{
                ans=sorted_Prefix[r]-sorted_Prefix[l-1];
            }
            System.out.println(ans);
        }        
        sc.close();
    }
}
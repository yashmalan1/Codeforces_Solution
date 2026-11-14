import java.util.Scanner;
 
/**
 * BThreeSevens
 */
public class BThreeSevens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int m=sc.nextInt();
            int arr[][]=new int[m][];
            for(int i=0;i<m;i++){
                int n=sc.nextInt();
                arr[i]=new int[n];
 
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int ans[]=new int[m];
            boolean seen[]=new boolean[50_001];
            boolean possible=true;
            for(int i=m-1;i>=0;i--){
                boolean found=false;
                for(int j=0;j<arr[i].length;j++){
                    if(!seen[arr[i][j]]){
                        ans[i]=arr[i][j];
                        found=true;
                        break;
                    }
                }
                if(!found){
                    possible=false;
                    break;
                }
                for(int j=0;j<arr[i].length;j++){
                   seen[arr[i][j]]=true; 
                }
            }
            if(!possible){
                System.out.println(-1);
            }
            else{
                for(int i=0;i<m;i++){
                    System.out.print(ans[i]+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
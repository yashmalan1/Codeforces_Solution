import java.util.HashMap;
import java.util.Scanner;
 
/**
* CGoodSubarrays
*/
public class CGoodSubarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
 
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.charAt(i)-'1';
            }
 
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
 
        int sum=0;
        long count=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                count += map.get(sum);
            }
        map.put(sum,map.getOrDefault(sum,0)+1);
    }
 
System.out.println(count);
}
}
}
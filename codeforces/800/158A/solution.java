import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            String p = sc.next();
            String q = sc.next();
 
            int[] fre= new int[26];
            for(int i=0;i<n;i++){
                char ch=p.charAt(i);
                fre[ch-'a']++;
            }
        for(int i=0;i<m;i++){
            char ch=q.charAt(i);
            fre[ch-'a']--;
        }
 
    boolean flag = true;
 
    for(int i = 0; i < 26; i++) {
        if(i == 's'-'a' || i == 'i'-'a' || i == 'x'-'a') {
            if(fre[i] != 1) flag = false;
        }
    else {
        if(fre[i] != 0) flag = false;
    }
}
 
System.out.println(flag ? "YES" : "NO");
 
}
}
}
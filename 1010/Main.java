import java.util.*;

public class Main{
    
    static int dp[][];
    
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int t = sc.nextInt();
        for(int i=0; i < t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            dp = new int[m+1][n+1];
            sb.append(combi(m, n)+"\n");
        }
        System.out.println(sb);
    }
    static int combi(int m, int n){
        if(dp[m][n] > 0)
            return dp[m][n];
        if(m == n || n == 0)
            return dp[m][n] = 1;
        
        return dp[m][n] = combi(m-1, n-1) + combi(m-1, n);
    }
}
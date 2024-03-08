def combi(m, n, dp):
    if dp[m][n] > 0:
        return dp[m][n]
    
    if m==n or n==0:
        dp[m][n] = 1
        return dp[m][n]
            
    dp[m][n] = combi(m-1, n-1, dp) + combi(m-1, n, dp)
    return dp[m][n]
            
t = int(input())
a = []
for i in range(t):
    n, m = list(map(int, input().split()))
    dp = [[0]*(n+1) for _ in range(m+1)]
    
    a.append(str(combi(m,n, dp)))

print("\n".join(a))
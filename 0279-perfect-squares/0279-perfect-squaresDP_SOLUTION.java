class Solution {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return numSquaresHelper(n,dp);
    }
    public int numSquaresHelper(int n, int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int Smallest=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int temp=numSquaresHelper(n-i*i,dp)+1;
            Smallest=Math.min(Smallest,temp);
        }
        dp[n]=Smallest;
        return Smallest;
    }
}
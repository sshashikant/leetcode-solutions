class Solution {
    public int countOrders(int n) {
        long[] dp = new long[501];
        int mod = (int) Math.pow(10,9)+7;
        dp[1] = 1l;
        dp[2] = 6l;
        for(int i=3; i<=n; i++){
            int key = 2*i-1;
            int permutations = key*(key+1)/2;
            dp[i] = ((dp[i-1]*permutations))%mod;
        }
        return (int) dp[n];
    }
}

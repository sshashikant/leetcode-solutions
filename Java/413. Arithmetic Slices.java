class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int dp = 0;
        int ans = 0;
        
        for(int i=2; i<nums.length; i++){
            if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2]){
                dp++;
                ans += dp;
            }
            else{
                dp = 0;
            }
        }
        return ans;
    }
}

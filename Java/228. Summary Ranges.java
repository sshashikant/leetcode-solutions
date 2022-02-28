class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length==0)
            return ans;
        int first = nums[0], last = nums[0];
                
        for(int i=0; i<nums.length; i++){
            if(i==nums.length-1){
                if(first != last){
                    ans.add(Integer.toString(first)+"->"+Integer.toString(last));
                }
                else
                    ans.add(Integer.toString(first));
                break;
            }
            if(last+1 != nums[i+1]){
                if(first != last){
                    ans.add(Integer.toString(first)+"->"+Integer.toString(last));
                }
                else
                    ans.add(Integer.toString(first));
                first = nums[i+1];
                last = nums[i+1];
            }
            else
                last = nums[i+1];
        }
        return ans;
    }
}

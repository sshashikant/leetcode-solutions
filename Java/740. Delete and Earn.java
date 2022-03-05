class Solution {
    public int deleteAndEarn(int[] nums) {
        int earn1 = 0, earn2 = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(count.containsKey(nums[i]))
                count.put(nums[i], count.get(nums[i])+1);
            else
                count.put(nums[i], 1);
        }
        
        Arrays.sort(nums);
        int[] unique = new int[count.size()];
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(i==0){
                unique[k] = nums[i];
                k++;
            }
            else{
                if(unique[k-1]==nums[i])
                    continue;
                else{
                    unique[k] = nums[i];
                    k++;
                }
            }
        }
        for(int l=0; l<unique.length; l++){
            int curEarn = unique[l] * count.get(unique[l]);
            if(l>0 && unique[l]==unique[l-1]+1){
                int temp = earn2;
                earn2 = Math.max(curEarn+earn1, earn2);
                earn1 = temp;
            }
            else{
                int temp = earn2;
                earn2 = curEarn + earn2;
                earn1 = temp;
            }
        }
        return earn2;
    }
}

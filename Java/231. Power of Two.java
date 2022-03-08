class Solution {
    public boolean isPowerOfTwo(int n) {
        int curr = 1;
        for(int i=0; i<=30; i++){
            //System.out.println(curr);
            if(curr == n)
                return true;
            
            if(curr <= Integer.MAX_VALUE/2)
                curr = curr * 2;          
        }
        return false;
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        int n = words.length;
        String last = words[n-1];
        int ans = last.length();
        return ans;
    }
}

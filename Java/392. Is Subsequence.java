class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int i = 0;
        for(int j=0; i<m && j<n; j++){
            if(s.charAt(i)==t.charAt(j))
                i++;
        }
        return (i==m);
    }
}

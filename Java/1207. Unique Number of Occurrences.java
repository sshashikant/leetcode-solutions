class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : arr)
            hm.put(i, hm.getOrDefault(i, 0)+1);
        
        return hm.values().size() == new HashSet<>(hm.values()).size();
    }
}

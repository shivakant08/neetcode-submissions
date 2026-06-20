class Solution {
    public int characterReplacement(String s, int k) {
        int l= 0;
        int maxLength=0;
        int maxRepeatCount = 0;
        Map<Character, Integer> map = new HashMap<>();
        for( int r= 0;r < s.length(); r++){
            char curr = s.charAt(r);
            map.put(curr, map.getOrDefault(curr, 0)+1);
            maxRepeatCount = Math.max(maxRepeatCount, map.get(curr));
            int nonRepeat= (r- l + 1) - maxRepeatCount;

            if(nonRepeat > k){
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            maxLength = Math.max(maxLength, (r-l + 1));
        }
        return maxLength;
    }
}

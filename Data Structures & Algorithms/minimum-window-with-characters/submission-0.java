class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[128];
        int required = 0;

        for(char ch : t.toCharArray()){
            if(need[ch] == 0) required++;
            need[ch]++;
        }

        int[] have = new int[128];
        int formed = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int startIdx = 0;

        for(int right= 0; right < s.length(); right++){
            char rChar = s.charAt(right);
            have[rChar]++;

            if(need[rChar] > 0 && need[rChar] == have[rChar]){
                formed++;
            }

            while(formed == required){
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    startIdx = left;
                }

                char lChar = s.charAt(left);
                have[lChar]--;

                if(need[lChar] > 0 && have[lChar] < need[lChar]){
                    formed--;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + minLen);
    }
}

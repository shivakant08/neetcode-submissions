class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] ch1 = new int[26];
        int[] ch2 = new int[26];

        for(char ch : s1.toCharArray()){
            ch1[ch - 'a']++;
        }

        for(int i = 0; i < s1.length(); i++){
            ch2[s2.charAt(i)- 'a']++;
        }
        if(matches(ch1, ch2)) return true;

        for(int right = s1.length(); right < s2.length(); right++){
            ch2[s2.charAt(right) - 'a']++;

            ch2[s2.charAt(right - s1.length()) - 'a']--;
            if(matches(ch1, ch2)) return true;
        }

        return false;
    }

    public boolean matches(int[] arr1, int[] arr2){
        for(int i = 0; i < 26; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}

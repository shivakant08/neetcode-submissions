class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
           if(map.containsKey(nums[i])){
            int val = map.get(nums[i]);
            map.put(nums[i], val + 1);
           }else{
            map.put(nums[i], 1);
           }
        }

        for(int value: map.values()){
            if(value > 1) return true;

        }
        return false;
        
    }
}
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> duplicate= new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(duplicate.containsKey(nums[i])){
                int val = duplicate.get(nums[i]);
                duplicate.put(nums[i], val + 1);
            }else{
                duplicate.put(nums[i], 1);
            }
        }

        for(int value: duplicate.values()){
            if(value > 1) return true;
            
        }
        return false;
    }
}
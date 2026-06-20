class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i >0 && nums[i] == nums[i- 1]) continue;
            int low= i+ 1;
            int high = nums.length - 1;

            while(low < high){
                int triplet= nums[i]+ nums[low] + nums[high];
                if(triplet > 0){
                    high--;
                }else if(triplet < 0){
                    low++;
                }else{
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while(low < high && nums[low] == nums[low + 1]) low++;
                    while(low < high && nums[high] == nums[high - 1]) high--;
                    low++;
                    high--;
                
                }
                
            }


        }
        return res;
    }
}

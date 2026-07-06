class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int res = high;

        while(low <= high){
            int mid = low +(high - low) /2;

            int totalHours = 0;
            for(int p : piles){
                totalHours += Math.ceil((double)p / mid);

            }
            if(totalHours <= h){
                res = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return res;
    }
}

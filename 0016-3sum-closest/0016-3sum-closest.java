class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int max_diff = Integer.MAX_VALUE;
        int bestsum = 0;

        for(int i =0;i<nums.length-2;i++){
            int left=i+1;
            int right = nums.length-1;
            int sum = target-nums[i];

            while(left<right){
                int s = nums[left]+nums[right];
                int currSum = nums[i] + nums[left] + nums[right];
                
                if(s == sum ){
                    
                    return target; 
                }
                else if(s> sum){
                    int diff = Math.abs(target - currSum);
                    if(max_diff>diff){
                        max_diff=diff;
                        bestsum=currSum;
                        
                    }
                    right--;
                }
                else{
                    int diff = Math.abs(target - currSum);
                    if(max_diff>diff){
                        max_diff=diff;
                        bestsum=currSum;
                    }
                    left++;

                }
            }
        }
        return bestsum;
    }
}
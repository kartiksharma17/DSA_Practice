class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //i+j+k=0
        //j+k=-i
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i =0; i<nums.length-2; i++){
            if((i>0) && (nums[i]==nums[i-1])){
                continue;
            }

            int sum = -nums[i];

            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int s = nums[left] + nums[right];
                if(s == sum){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while(left < right && nums[left]==nums[left-1])
                        left++;
                    

                    while(left < right && nums[right]==nums[right+1])
                        right--;
                    
                } 


                else if(s > sum){
                    right--;
                }

                else{
                    left++;
                }
            }

            

            

        }
        return result;
    }
}
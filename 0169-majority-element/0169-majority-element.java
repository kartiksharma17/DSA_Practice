class Solution {
    public int majorityElement(int[] nums) {
        //brute
        
        // int len=nums.length;
        
        // for(int i=0; i<len; i++){
        //     int count=0;
        //     for(int j=0; j<len; j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
           
        //     if(count>len/2){
        //         return nums[i];
        //     }

            
        // }
        
        // return -1;



        //better 
        HashMap<Integer, Integer> map = new HashMap<>();
        int len=nums.length;


        //counting frequency 
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int target=len/2;

        //finding majority element
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>target){
                return entry.getKey();
            }

        }
        
        return -1;
    }
}
class Solution {
    public int maxSubArray(int[] nums) {

        //brute 
        // int maxi=Integer.MIN_VALUE;

        // int n=nums.length;
        // for(int i=0; i<n; i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
                
                
        //         sum+=nums[j];
        //         maxi=Math.max(sum, maxi);
                
        //     }
        // }
        // return maxi;


        //optimized

        int maxi=Integer.MIN_VALUE;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];

            maxi=Math.max(maxi, sum);

            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}
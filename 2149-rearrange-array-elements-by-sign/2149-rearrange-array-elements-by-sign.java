class Solution {
    public int[] rearrangeArray(int[] nums) {
        //brute force
        // int n=nums.length;
        // int pos[]=new int[n/2];
        // int neg[]=new int[n/2];

        // int posIdx=0;
        // int negIdx=0;

        // for(int i=0;i<n;i++){
        //     if(nums[i]>=0){
        //         pos[posIdx]=nums[i];
        //         posIdx++;

        //     }
        //     else{
        //         neg[negIdx]=nums[i];
        //         negIdx++;

        //     } 
        // }

        // for(int j=0;j<n/2;j++){
        //     nums[2*j]=pos[j];
        //     nums[2*j+1]=neg[j];

        // }

        // return nums;



        //optimized
        int n=nums.length;
        int[] ans = new int[n];
        
        int pos=0;
        int neg=1;
        for(int i=0;i<n; i++){
            if(nums[i]>=0){
                
                ans[pos]=nums[i];
                
                pos=pos+2;
            }
            else{
                ans[neg]=nums[i];
                neg=neg+2;
            }
        }
        return ans;


    }
}
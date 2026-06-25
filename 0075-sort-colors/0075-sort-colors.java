class Solution {
    public void sortColors(int[] nums) {

        //[2,0,2,1,1,0]
        //start,low-1 --> zeros
        //high+1,end --> twos
        //low,mid-1 --> ones

        //mid,high --> problem 

        //brute solution
        int zero =0;
        int one =0;
        int two =0;

         for (int num : nums) {
            if (num == 0) zero++;
            else if (num == 1) one++;
            else two++;
        }

        int i=0;

        while(zero-- > 0){
            nums[i++]=0;

        }

        while(one-- > 0){
            nums[i++]=1;

        }

        while(two-- > 0){
            nums[i++]=2;

        }



        



        
    
    }
    
}
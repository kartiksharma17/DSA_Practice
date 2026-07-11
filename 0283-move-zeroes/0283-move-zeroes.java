class Solution {
    public void moveZeroes(int[] nums) {

        // //brute force
        // int n=nums.length;
        // ArrayList<Integer> temp= new ArrayList<>(); 
        // for(int i =0; i<n; i++){
        //     if(nums[i]!=0){
        //         temp.add(nums[i]);

        //     }
            
        // }
        // for(int j=0;j<temp.size();j++){
        //     nums[j] = temp.get(j);
        // }

        // for(int k=temp.size(); k<n; k++){
        //     nums[k] = 0;
        // }


        //optimal solution

        int n= nums.length;
        int low =0;
        
        
        for(int high=0; high<n; high++){
            if(nums[high]!=0){
                int temp =nums[low];
                nums[low]=nums[high];
                nums[high]=temp;
                low++;


            }
            
        }

       


    }
}
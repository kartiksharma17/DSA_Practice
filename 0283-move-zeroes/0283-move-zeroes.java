class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> temp= new ArrayList<>(); 
        for(int i =0; i<n; i++){
            if(nums[i]!=0){
                temp.add(nums[i]);

            }
            
        }
        for(int j=0;j<temp.size();j++){
            nums[j] = temp.get(j);
        }

        for(int k=temp.size(); k<n; k++){
            nums[k] = 0;
        }


    }
}
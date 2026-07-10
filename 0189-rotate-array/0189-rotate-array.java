class Solution {
    public void rotate(int[] nums, int k) {

        ArrayList<Integer> temp = new ArrayList<>();
        int n = nums.length;
        k = k % n; 

        //element storing from n-1 to k
        int i =n-1;
        while(i>=n-k){
            temp.add(nums[i]);
            i--;
        }

        //right shifting remaining elements 
            for (int j = n - k - 1; j >= 0; j--) {
            nums[j + k] = nums[j];
        }

        //placing the temp array element 
        //eg [7,6,5]
        for(int l=0; l<temp.size(); l++){

            nums[(k-1)-l] =temp.get(l);


        }
        
    }
}
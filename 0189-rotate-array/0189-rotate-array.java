class Solution {
    public void rotate(int[] nums, int k) {

        //this is brute force 

        // ArrayList<Integer> temp = new ArrayList<>();
        // int n = nums.length;
        // k = k % n; 

        // //element storing from n-1 to k
        // int i =n-1;
        // while(i>=n-k){
        //     temp.add(nums[i]);
        //     i--;
        // }

        // //right shifting remaining elements 
        //     for (int j = n - k - 1; j >= 0; j--) {
        //     nums[j + k] = nums[j];
        // }

        // //placing the temp array element 
        // //eg [7,6,5]
        // for(int l=0; l<temp.size(); l++){

        //     nums[(k-1)-l] =temp.get(l);


        // }


        //trying to optimize it

        int n = nums.length;
        k=k%n;

        

        int right=n-1;
        int left=n-k;
        while(right>left){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            right--;
            left++;  
            
        }

        left=0;
        right =n-k-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            right--;
            left++;
        }

        //reversing whole array now
        left= 0;
        right=n-1;

        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            right--;
            left++;
        }

        







        
    }
}
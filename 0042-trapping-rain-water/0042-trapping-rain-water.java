class Solution {
    public int trap(int[] height) {

        
        int n=height.length;
        if (n == 0) return 0;

        int[] leftArr= new int[n], rightArr= new int[n];

        int res=0;

        int left=1, right=n-2;
        leftArr[0]=height[0];
        rightArr[n-1]=height[n-1];


        while(left<n){

            

            leftArr[left]= Math.max(height[left],leftArr[left-1]);

            left++;
        }

        while(right>=0){
            

            rightArr[right]=Math.max(height[right], rightArr[right+1]);

            right--;
        }

        for(int i=0; i<n;i++){
            res+= (Math.min(leftArr[i], rightArr[i])-height[i]);

        }

        return res;





    }
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int idx1=0;
        int idx2=numbers.length-1;
        while(idx1<idx2){
            int sum=numbers[idx1]+numbers[idx2];

            if(sum<target){
                idx1++;
            }

            else if(sum>target){
                idx2--;
            }
            
            else{
                return new int[]{idx1+1, idx2+1};
            }
            

        }
        return new int[]{-1, -1};
    }
}
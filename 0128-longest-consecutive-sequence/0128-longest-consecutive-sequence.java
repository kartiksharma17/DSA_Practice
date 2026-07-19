class Solution {
    public int longestConsecutive(int[] nums) {

       
        int n=nums.length;
        if(n==0) return 0;

        int maxLen=0;

        HashSet<Integer> set = new HashSet<>();

        for(int num: nums) {
            set.add(num);
        }

        for(int num: set){
            if(num == Integer.MIN_VALUE || !set.contains(num-1)){
                int x=num;
                int len=1;

                while(x!=Integer.MAX_VALUE && set.contains(x+1)){
                    x++;
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
            

        }


        return maxLen;

        

        
    }
}
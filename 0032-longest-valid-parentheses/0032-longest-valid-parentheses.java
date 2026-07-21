class Solution {
    public int longestValidParentheses(String s) {
        int left=0, right=0, maxLen=0;

        //traversing left --> right
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(ch =='('){
                left++;

            } 
            
            else right++;

            if(right==left){
                maxLen=Math.max(maxLen,2*right);
            }
            else if(right>left){
                left=0;
                right=0;
            }
        }

        left=0;
        right=0;

        //traversing right --> left
        for(int i=s.length()-1; i>=0; i--){
            char ch=s.charAt(i);
            if(ch =='('){
                left++;

            }
            
            else right++;

            if(right==left){
                maxLen=Math.max(maxLen,2*right);
            }
            else if(left>right){
                left=0;
                right=0;
            }
        }

        return maxLen;

    }
}
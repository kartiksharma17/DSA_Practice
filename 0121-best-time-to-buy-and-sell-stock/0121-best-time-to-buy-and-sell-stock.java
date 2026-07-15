class Solution {
    public int maxProfit(int[] prices) {
        //brute force  

        int n= prices.length;
        int mini= prices[0];
        

        int dif=0;
        


        //at minimum cost we can buy product

        for(int i=0; i<n;i++){
           dif = Math.max(dif, prices[i] - mini);

           //sell the product

            if (prices[i] < mini) {
                mini = prices[i];
            }

        }

        

        

        return dif;

        


    }
}
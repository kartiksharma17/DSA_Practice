class Solution {
    public List<List<Integer>> generate(int numRows) {
        // nCr =n!/r!*(n-r)!

        List<List<Integer>> res= new ArrayList<>();

        for(int i=0;i<numRows;i++){
            ArrayList<Integer> row= new ArrayList<>();
            
            for(int j=0;j<=i;j++){
                row.add(nCr(i,j));
            }
            res.add(row);
            

        }
        return res;



        




    }
    //function for ncr
        public int nCr(int n, int r){
            long res =1;
            for(int i=0; i<r;i++){
                res=res*(n-i);
                res=res/(i+1);

            }
            return (int)res;
        }
}
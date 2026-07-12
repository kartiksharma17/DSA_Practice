class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        for(int i=0; i<=rowIndex;i++){
            res.add(nCr(rowIndex,i));

        }
        return res;
    }

    private int nCr(int n,int r){
        long res=1;

        

        for(int i=0; i<r; i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int)res;
    }
}
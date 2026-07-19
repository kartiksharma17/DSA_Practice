class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res= new ArrayList<>();

        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;
        int bottom=m-1;

        int left=0;
        int right=n-1;

        while (top <= bottom && left <= right){

            //left --> right(1,2,3)

            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;

            //top --> bottom(6,9)

            for(int j=top;j<=bottom;j++){
                res.add(matrix[j][right]);
            }
            right--;

            //right --> left(8,7)
            
            if(top<=bottom){
                
                for(int k=right;k>=left;k--){
                    res.add(matrix[bottom][k]);
                }
                bottom--;

            }

            


            //bottom --> top(4)

            if(left<=right){

                for(int l=bottom;l>=top;l--){
                    res.add(matrix[l][left]);
                }
                left++;
            }

            


        }

        


        return res;



    }
    
}
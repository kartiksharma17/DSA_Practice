class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length; 

        //transpose of matrix kiya: transpose diagonal k element same rehte hai (left-->right wale)  
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
    
        }


        //last column swap kiya transpose matrix ka 
        for(int i=0; i<n;i++){
            int left=0;
            int right=n-1;

            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;

                left++;
                right--;
            }
        }
        
    }
}
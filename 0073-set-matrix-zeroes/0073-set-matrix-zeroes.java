class Solution {
    public void setZeroes(int[][] matrix) {

        //brute

        boolean[][] mark = new boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {
                    markRow(matrix, mark, i);
                    markCol(matrix, mark, j);
                }

            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (mark[i][j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void markRow(int[][] matrix, boolean[][] mark, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[row][j] != 0) {
                mark[row][j] = true;
            }
        }
    }

    public void markCol(int[][] matrix, boolean[][] mark, int col) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] != 0) {
                mark[i][col] = true;
            }
        }
    }
}
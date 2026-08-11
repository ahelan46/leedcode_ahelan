// Last updated: 8/11/2026, 3:58:16 PM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                if (matrix[i][j] == -1) {
                    
                    ans[i][j] = matrix[i][j];

                    for (int k = 0; k < matrix.length; k++) {
                        if (ans[i][j] < matrix[k][j]) {
                            ans[i][j] = matrix[k][j];
                        }
                    }

                } else {
                    ans[i][j] = matrix[i][j];
                }
            }
        }

        return ans;
    }
}
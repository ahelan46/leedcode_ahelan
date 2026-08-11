// Last updated: 8/11/2026, 4:07:23 PM
// class Solution {
//     int count = 0;
//     public int totalNQueens(int n) {
       
//         char[][] board = new char[n][n];

//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){
//                 board[i][j] = '.';
//             }
//         }
//         nqueen(board, 0, n);
//         return count;
//     }
//     private void nqueen(char[][] board, int row, int n){

//         // Base case
//         if(row == n){
//             count++;
//             return;
//         }
//         for(int col = 0; col < n; col++){
//             if(isSafe(board,row,col,n)){
//                 board[row][col] = 'Q';

//                 nqueen(board, row+1, n);

//                 board[row][col] = '.';
//             }
//         }
//     }
//     private boolean isSafe(char[][] board, int row ,int col, int n){
//         int i,j;
//         // chech column
//         for( i = 0; i < n; i++){
//            if(board[i][col] == 'Q') return false;
//         }
//         // check /
//          i = row;
//          j = col;
//         while(i >= 0 && j < n){
//             if(board[i][j] == 'Q') return false;
//             i--;
//             j++;
//         }
//         // check \
//         i = row;
//         j = col;
//         while(i >= 0 && j >= 0){
//             if(board[i][j] == 'Q') return false;
//             i--;
//             j--; 
//     }
//     return true;
//     }
// }
// 4906
// 4906
// 4906
class Solution {

    int count = 0;
    boolean[] cols;
    boolean[] diag1;
    boolean[] diag2;

    public int totalNQueens(int n) {

        cols = new boolean[n];
        diag1 = new boolean[2 * n];
        diag2 = new boolean[2 * n];

        backtrack(0, n);

        return count;
    }

    private void backtrack(int row, int n) {

        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {

            int d1 = row - col + n;
            int d2 = row + col;

            if (cols[col] || diag1[d1] || diag2[d2])
                continue;

            cols[col] = true;
            diag1[d1] = true;
            diag2[d2] = true;

            backtrack(row + 1, n);

            cols[col] = false;
            diag1[d1] = false;
            diag2[d2] = false;
        }
    }
}
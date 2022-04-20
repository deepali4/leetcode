class Solution {
    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) return;
        if (board.length < 3 || board[0].length < 3) return;
        int m = board.length;
        int n = board[0].length;
        //Any 'O' connected to a boundary can't be turned to 'X', so Start from first and last column, turn 'O' to '*'.
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') helper(board, i, 0);
            if (board[i][n - 1] == 'O') helper(board, i, n - 1);
        }
        //Start from first and last row, turn '0' to '*'
        for (int j = 1; j < n - 1; j++) {
            if (board[0][j] == 'O') helper(board, 0, j);
            if (board[m - 1][j] == 'O') helper(board, m - 1, j);
        }
        //post-prcessing, turn 'O' to 'X', '*' back to 'O', keep 'X' intact.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                if (board[i][j] == '*') board[i][j] = 'O';
            }
        }
    }
    //Use DFS algo to turn internal however boundary-connected 'O' to '*';
    private void helper(char[][] board, int r, int c) {
        if (r < 0 || c < 0 || r > board.length - 1 || c > board[0].length - 1 || board[r][c] != 'O') return;
        board[r][c] = '*';
        helper(board, r + 1, c);
        helper(board, r - 1, c);
        helper(board, r, c + 1);
        helper(board, r, c - 1);
    }
}
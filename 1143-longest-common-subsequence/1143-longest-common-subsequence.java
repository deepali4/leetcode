class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int [text1.length()+1][text2.length()+1];
        
    for (int col = text2.length() - 1; col >= 0; col--) {
      for (int row = text1.length() - 1; row >= 0; row--) {
        // If the corresponding characters for this cell are the same...
        if (text1.charAt(row) == text2.charAt(col)) {
          dp[row][col] = 1 + dp[row + 1][col + 1];
        // Otherwise they must be different...
        } else {
          dp[row][col] = Math.max(dp[row + 1][col], dp[row][col + 1]);
        }
      }
    }
        
        return dp[0][0];
    }
}
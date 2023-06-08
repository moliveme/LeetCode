// O(n + m)

class Solution {
    public int countNegatives(int[][] grid) {

        int negatives = 0;
        int col = 0;

        for (int row = grid.length - 1; row > -1; row--) {
            while ((col < grid[0].length) && (grid[row][col] >= 0)) {
                col++;
            }
            negatives += grid[0].length - col;
        }

        return negatives;
        
    }
}
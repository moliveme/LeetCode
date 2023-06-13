import java.util.*;

class Solution {
    public int equalPairs(int[][] grid) {

        HashMap<String, Integer> rows = new HashMap<>();
        HashMap<String, Integer> cols = new HashMap<>();

        // store rows

        String temp = "";

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                temp += Integer.toString(grid[i][j]) + ".";
            }
            if (rows.containsKey(temp)) {
                rows.put(temp, rows.get(temp) + 1);
            } else {
                rows.put(temp, 1);
            }

            temp = "";
        }

        // sum cols

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                temp += Integer.toString(grid[j][i]) + ".";
            }
            if (cols.containsKey(temp)) {
                cols.put(temp, cols.get(temp) + 1);
            } else {
                cols.put(temp, 1);
            }

            temp = "";
        }

        int equalPairs = 0;

        for (String row_val : rows.keySet()) {
            if (cols.containsKey(row_val)) {
                System.out.println("match");
                System.out.printf("row_weighted sum: %s num rows %d num cols %d\n", row_val, rows.get(row_val), cols.get(row_val));
                equalPairs += rows.get(row_val) * cols.get(row_val);
            }
        }

        return equalPairs;
        
    }
}
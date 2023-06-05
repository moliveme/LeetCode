import java.lang.Double;

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        int n = coordinates.length;
        double slope = 0.00;

        // check for div by 0
        if (coordinates[1][0] == coordinates[0][0]) {
            System.out.println("div by 0//slope infinite");
            slope = Double.POSITIVE_INFINITY;
        } else {
            slope = (1.00 * (coordinates[1][1] - coordinates[0][1]))
                    /(coordinates[1][0] - coordinates[0][0]);
        }

        double this_slope = 0.00;

        for (int i = 1; i < n; i++) {

            System.out.println("i "+i);

            System.out.println("y2 "+coordinates[i][1]+" y1 "+coordinates[0][1]+
                               " x2 "+coordinates[i][0]+" x1 "+coordinates[0][0]);

            // check for div by 0
            if (coordinates[i][0] == coordinates[0][0]) {
                System.out.println("div by 0//slope infinite");
                this_slope = Double.POSITIVE_INFINITY;
            } else {
                this_slope = (1.00 * (coordinates[i][1] - coordinates[0][1]))
                            /(coordinates[i][0] - coordinates[0][0]);
            }

            System.out.println("slope "+slope+" this_slope "+this_slope);

            if (this_slope != slope) {
                System.out.println("slope mismatch");
                return false;
            }

        }
        System.out.println("staight");
        return true;
    }
}
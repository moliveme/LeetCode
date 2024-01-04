package _2125;

public class _2125 {
    public int numberOfBeams(String[] bank) {
        int beams = 0;
        int r = bank.length;
        int c = bank[0].length();
        int[] lasers = new int[r];
        boolean[] isDevice = new boolean[r]; // default: false

        // populate lasers and isDevice, O(mn)
        for (int i = 0; i < r-1; i++) {
            for (int j = 0; j < c; j++) {
                if (bank[i].charAt(j)=='1') {
                    isDevice[i] = true;
                    lasers[i]++;
                }
            }
        }

        // count beams, O(m^2)
        int curr_beams = 0;
        int j;
        for (int i = 0; i < r; i++) {
            j = i+1;
            do {
                curr_beams = lasers[i]*lasers[j];
                j++;
            } while ((j<r)&&(curr_beams == 0));
            beams += curr_beams;
        }

        return beams;
    }
}

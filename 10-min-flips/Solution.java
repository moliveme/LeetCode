class Solution {
    public int minFlips(int a, int b, int c) {

        int ret = 0;

        int or = a | b;
        int prev_or = or;
        int xor = a ^ b;
        int prev_xor = xor;
        int and = a & b;
        int prev_and = and;
        int prev_c = c;

        System.out.println("a: "+Integer.toBinaryString(a));
        System.out.println("b: "+Integer.toBinaryString(b));

        while ((or != 0) || (c != 0)) {
            System.out.println("a | b: "+Integer.toBinaryString(or));
            System.out.println("c: "+Integer.toBinaryString(c));

            prev_or = or;
            or = or >> 1;

            prev_c = c;
            c = c >> 1;

            prev_and = and;
            and = and >> 1;

            prev_xor = xor;
            xor = xor >> 1;

            if ((or == (1.0 * prev_or) / 2) &&
                (c != (1.0 * prev_c) / 2)) {

                // if or has 0 and c has 1 at rightmost
                System.out.println("or has 0 and c has 1 at rightmost");
                ret++;
                System.out.println("ret "+ret);

            } 
            
            if ((or != (1.0 * prev_or) / 2) &&
                (c == (1.0 * prev_c) / 2)) { 

                // if c has 0 and or has 1 at rightmost
                System.out.println("c has 0 and or has 1 at rightmost");

                if (xor != (1.0 * prev_xor) / 2) {
                    // rightmost bit is a result of 0 | 1 or 1 | 0
                    ret++;
                }
                if (and != (1.0 * prev_and) / 2) {
                    // rightmost bit is a result of 1 | 1
                    ret += 2;
                }

                System.out.println("ret "+ret);
            }

            System.out.println("");

        }
        
        return ret;
    }
}
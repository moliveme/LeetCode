public class test {

    public void change_ar(int[] ar) {
        ar[0] = 56;
    }

    public void change_a( int a) {
        a = 56;
    }

    public static void main(String[] args) {

        int ar[] = {343};
        test my_t = new test();

        my_t.change_ar(ar);

        System.out.println(ar[0]);
        
    }
    
}

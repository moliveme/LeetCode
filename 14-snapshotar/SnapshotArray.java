import java.util.*;

class SnapshotArray {

    private int[] ar;
    private Stack<int[]> snapshots = new Stack<int[]>();

    public SnapshotArray(int length) {

        this.ar = new int[length];
        for (int i = 0; i < length; i++) {
            ar[i] = 0;
        }
        
    }
    
    public void set(int index, int val) {

        this.ar[index] = val;
        
    }
    
    public int snap() {

        snapshots.push(this.ar);

        return this.snapshots.size() - 1;
        
    }
    
    public int get(int index, int snap_id) {
        
        return this.snapshots.get(snap_id)[index];
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
package _2870;

class MinHeap {
    int[] heap;
    int elements;

    public MinHeap(int n) {
        heap = new int[n];
        elements = 0;
    }

    public int getElements() {
        return elements;
    }

    // swim up
    public void swimUp(int i) {
        int p = Math.floorDiv(i-1,2);
        int temp;
        if ((p >= 0) && (heap[p]>heap[i])) {
            // swap
            temp = heap[i];
            heap[i] = heap[p];
            heap[p] = temp;
            swimUp(p);
        }
    }

    public void sinkDown(int i) {
        int l = 2*i+1;
        int r = 2*i+2;
        int min = i;
        int temp;
        if (l < elements) {
            if (heap[l] < heap[min]) {
                min = l;
            }
            if ((r < elements)&&(heap[r]<heap[min])) {
                min =r;
            }
        }

        if (min != i) {
            // swap
            temp = heap[i];
            heap[i] = heap[min];
            heap[min] = temp;
            sinkDown(min);
        }
    }
    public void enqueue(int a) {
        heap[elements] = a;
        elements++;
        swimUp(elements-1);
    }

    // get min
    public int dequeue() {
        int min = heap[0];
        heap[0] = heap[elements-1];
        elements--;
        if (elements > 0) {
            sinkDown(0);
        }
        return min;
    }

    // get min wo delete
    public int peakMin() {
        return heap[0];
    }
}

public class _2870 {
    public int minOperations(int[] nums) {
        int res = 0;
        int n = nums.length;

        // use min heap to get elements and count up duplicates
        MinHeap h = new MinHeap(n);

        // nlogn
        for (int num : nums) {
            h.enqueue(num);
        }

        // pop one after the other
        // nlogn
        int curr_dups = 0;
        int q1, q2, q3;
        while (h.getElements() > 0) {
            int popped = h.dequeue();
            curr_dups=1;
            while ((h.getElements() > 0)&&(h.peakMin() == popped)) {
                curr_dups++;
                h.dequeue();
            }

            // check if el can be deleted safely
            // 3a + 2b = curr_dups. maximize a and minimize b
            // 3a + 2b = 10.
            // a = (10-2b)/3
            // a+b =
            if (curr_dups%3 == 0) {
                res += curr_dups/3;
            } else if (curr_dups%3 == 1) {
                if (curr_dups == 1) {
                    res = -1;
                    return res;
                } else {
                    res += (curr_dups-4)/3 + 2;
                }
            } else if (curr_dups%3 == 2) {
                res += curr_dups/3 + 1;
            }
        }

        return res;
    }
}

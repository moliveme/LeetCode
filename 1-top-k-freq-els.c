#include <stdlib.h>
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
#define TRUE (1)
#define FALSE (2)

typedef struct el {
    int num;
    int freq;
    int printed;
} el_t;

int compar(const void * a, const void * b) {

    return ((*((int*) a)) - (*((int*) b)));

}

int* topKFrequent (int* nums, int numsSize, int k, int* returnSize) {

    int n = sizeof(nums)/sizeof(int);

    // arrange array in ascending order

    qsort(nums, n, sizeof(int), &compar);

    // get freq distribution

    el_t* freqdict = malloc(sizeof(el_t) * n);

    int prev = nums[0] - 1;
    int this = nums[0];
    int index_of_topmost_el = -1;

    for (int i = 0; i < n; i++) {

        this = nums[i];

        if (prev != this) {
            index_of_topmost_el++;
            freqdict[index_of_topmost_el].num = this;
            freqdict[index_of_topmost_el].freq++;
        }
        else {
            freqdict[index_of_topmost_el].freq++;
        }

        prev = this;

    }

    // get top k elements

    

    int* topk = malloc(sizeof(int) * k);

    return topk;
}
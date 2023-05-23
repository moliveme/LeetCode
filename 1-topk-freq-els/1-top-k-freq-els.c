// time taken: 1h 49 min (ridiculous amount of time spent realizing
// ...sizeof(nums) would always return 8 idk why still)

#include <stdlib.h>
#include <stdio.h>
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
#define TRUE (1)
#define FALSE (0)

typedef struct el {
    int num;
    int freq;
} el_t;

int compar1(const void * a, const void * b) {

    return ((*((int*) a)) - (*((int*) b)));

}

int compar2(const void * a, const void * b) {

    return (((el_t*) b)->freq) - (((el_t*) a)->freq);

}

int* topKFrequent (int* nums, int numsSize, int k, int* returnSize) {

    int n = numsSize;

    printf("sizeof int %d num els %d\n",
            sizeof(int), n);

    printf("numsSize %d\n", numsSize);

    // arrange array in ascending order

    printf("in ");
    for (int i = 0; i < n; i++) {
        printf("%d ", nums[i]);
    } 
    printf("\n");

    qsort(nums, n, sizeof(int), &compar1);

    printf("ordered in ");
    for (int i = 0; i < n; i++) {
        printf("%d ", nums[i]);
    } 
    printf("\n");

    // get freq distribution

    el_t* freqdict = malloc(sizeof(el_t) * n);

    int prev = nums[0] - 1;
    int this = nums[0];
    int index_of_topmost_el = -1;

    for (int i = 0; i < n; i++) {

        this = nums[i];

        printf("prev %d this %d\n", prev, this);

        if (prev != this) {
            index_of_topmost_el++;
            freqdict[index_of_topmost_el].num = this;
            freqdict[index_of_topmost_el].freq = 1;
        }
        else {
            freqdict[index_of_topmost_el].freq++;
        }

        prev = this;

    }

    printf("freqdict\n");
    for (int i = 0; i <= index_of_topmost_el; i++) {
        printf("num %d f %d\n", freqdict[i].num, freqdict[i].freq);
    }

    // arrange freqdict in decreasing order of freq

    qsort(freqdict, index_of_topmost_el + 1, sizeof(el_t), &compar2);

    printf("arranged freqdict\n");
    for (int i = 0; i <= index_of_topmost_el; i++) {
        printf("num %d f %d\n", freqdict[i].num, freqdict[i].freq);
    }

    // get first k elements

    int* topk = malloc(sizeof(int) * k);
    *returnSize = k;

    for (int i = 0; i < k; i++) {
        topk[i] = freqdict[i].num;
    }

    free(freqdict);
    freqdict = NULL;
    return topk;
}

int main() {

    int nums[6] = {1, 2, 1, 3, 1, 3};
    int returnsize = 0;
    int* returnSize = &returnsize;
    int k = 2;
    int* topk = topKFrequent(nums, 6, k, returnSize);

    printf("top k ");
    for (int i = 0; i < k; i++) {
        printf("%d ", topk[i]);
    } 
    printf("\n");

    return 0;
}
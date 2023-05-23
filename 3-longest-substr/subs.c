#include <string.h>
#include <stdio.h>
#include <stdlib.h>

#define TRUE (1)
#define FALSE (0)

// bruteforce approach, time complexity n^3 lmao

int lengthOfLongestSubstring1(char * s){

    int n = strlen(s);

    printf("n %d\n", n);

    int max = 0;
    int cur_max = 0;
    char start;
    char next;
    char compare_to;
    int is_break = FALSE;

    for (int i = 0; i < n; i++) {

        start = s[i];
        cur_max = 1;
        printf(" start: cur_max %d max %d\n", cur_max, max);


        printf("i %d start %c\n", i, start);

        for (int j = i + 1; j < n; j++) {

            next = s[j];

            printf("j %d next %c\n", j, next);

            for (int k = i; k < j; k++) {

                compare_to = s[k];

                printf("k %d compare_to %c\n",
                        k, compare_to);

                if (compare_to == next) {
                    is_break = TRUE;
                    break;
                }
                
            }

            printf("is_break %d\n", is_break);

            if (!is_break) {
                cur_max++;
                printf("continue: cur_max %d max %d\n", cur_max, max);
            }
            else {
                printf("dup found\n");
                is_break = FALSE;
                break;
            }
            
        }

        printf("end: cur_max %d max %d\n", cur_max, max);

        if (cur_max > max) {
            max = cur_max;
            cur_max = 0;
        }

    }

    return max;

}



int main() {
    char *s = "abcde";
    printf("l %d\n", lengthOfLongestSubstring(s));
    return 0;
}
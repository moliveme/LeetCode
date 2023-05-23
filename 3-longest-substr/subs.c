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

// trying O(2n)
// yay i can successfully work sets in c

int lengthOfLongestSubstring2(char * s) {
        
    int n = strlen(s);

    printf("n %d\n", n);

    int max = 0;
    int cur_l = 0;
    int l = 0;
    int r = 0;
    char set_of_all_chars[95];

    for (int i = 0; i < 95; i++) {
        set_of_all_chars[i] = '\0';
    }

    for (int r = 0; r < n; r++) {

        if (set_of_all_chars[s[r] % 95] == s[r]) {
            // update l, remove from set
            while (s[l] != s[r]) {
                set_of_all_chars[s[l] % 95] = '\0';
                l++;
            }
            l++;
        }
        else {
            // add to set
            set_of_all_chars[s[r] % 95] = s[r];
        }

        cur_l = r - l + 1;

        if (cur_l > max) {
            max = cur_l;
        }

    }

    return max;

}

// trying O(n)

typedef struct el {
    int index;
    char val;
} set_el;

int lengthOfLongestSubstring(char * s) {
        
    int n = strlen(s);

    printf("n %d\n", n);

    int max = 0;
    int cur_l = 0;
    int l = 0;
    int r = 0;
    set_el set_of_all_chars[95];

    for (int i = 0; i < 95; i++) {
        set_of_all_chars[i].val = '\0';
        set_of_all_chars[i].index = -1;
    }

    int old_l = l;

    for (int r = 0; r < n; r++) {

        printf("l %d r %d cur_l %d max %d\n", l, r, cur_l, max);

        printf(" set_of_all_chars[s[r] mod 95].val %c s[r] %c\n", 
                set_of_all_chars[s[r] % 95].val, s[r]);

        printf(" set_of_all_chars[s[r] mod 95].index %d\n", 
                set_of_all_chars[s[r] % 95].index);

        if (set_of_all_chars[s[r] % 95].val == s[r]) {
            // update l, remove from set
            old_l = l;
            l = set_of_all_chars[s[r] % 95].index + 1;
            set_of_all_chars[s[r] % 95].index = r;
            for (int i = 0; i < 95; i++) {
                if ((set_of_all_chars[i].index < l - 1)
                    && (set_of_all_chars[i].index >= old_l)) {
                    set_of_all_chars[i].val = '\0';
                    set_of_all_chars[i].index = -1;
                }
            }
        }
        else {
            // add to set
            set_of_all_chars[s[r] % 95].val = s[r];
            set_of_all_chars[s[r] % 95].index = r;
        }

        cur_l = r - l + 1;

        if (cur_l > max) {
            max = cur_l;
        }

    }

    return max;

}

int main() {
    char *s = "abeeceeeee";
    printf("l %d\n", lengthOfLongestSubstring(s));
    return 0;
}